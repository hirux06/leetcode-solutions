class Solution {
    public void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = low;
        int high = n-1;
        int i=0;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
}