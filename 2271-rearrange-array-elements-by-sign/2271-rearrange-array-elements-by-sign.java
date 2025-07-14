class Solution {
    public int[] rearrangeArray(int[] arr) {
        int pos = 0; 
        int neg = pos+1;
        int n = arr.length;
        int newArr[] = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                newArr[pos] = arr[i];
                pos += 2;
            }else {
                newArr[neg] = arr[i];
                neg += 2;
            }
        }
        return newArr;
    }
}