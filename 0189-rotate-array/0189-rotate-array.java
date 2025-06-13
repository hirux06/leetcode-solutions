class Solution {
    public static void reverse(int arr[], int st, int end){
        while(st <= end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
}