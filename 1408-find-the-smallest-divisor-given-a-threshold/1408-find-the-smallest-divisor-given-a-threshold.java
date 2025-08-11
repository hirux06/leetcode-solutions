class Solution {
    private int smalle(int[] nums, int mid, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.ceil((double) nums[i]/(double) mid);
        }

        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        int low = 1; int high = maxi;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            int div = smalle(nums, mid, n);
            if(div <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
}