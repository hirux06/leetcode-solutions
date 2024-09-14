class Solution {
    public int singleNumber(int[] nums) {
        // Think of XOR properties
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans = ans ^ nums[i];
        }

        return ans;
    }
}