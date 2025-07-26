class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        // int totalSum = (n)*(n+1)/2;
        // int sum = 0;
        // for(int i=0; i<n; i++){
        //     sum += arr[i];
        // }
        // return totalSum - sum;
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0; i<n; i++){
            xor2 ^= arr[i];
            xor1 ^= (i+1);
        }
        return xor1 ^ xor2;
       
    }
}