class Solution {
    
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        if(m == 0){
            for (int i = 0; i < n; i++) {
                arr1[i] = arr2[i];
            }
            return;
        }else if(n == 0){
            return;
        }
        int i = 0, j = 0;
        while(i < m){
            if(arr1[i] > arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i++;
                while(j< n-1 && arr2[j] > arr2[j+1]){
                    temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                    j++;
                }
                j  = 0;
            }else {
                i++;
            }
        }
        for(int k=0; k<n; k++){
            arr1[m+k] = arr2[k];
        }
    }
}