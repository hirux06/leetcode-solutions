class Solution {
    private int findTotalHours(int[] piles,int mid){
        int ans = 0;
        for(int i=0; i<piles.length; i++){
            ans += Math.ceil((double) piles[i]/(double) mid);
        }

        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi = (maxi < piles[i]) ? piles[i] : maxi;
        }
        int low = 1, high = maxi;
        while(low <= high){
            int mid = (low + high) / 2;
            int tot = findTotalHours(piles, mid);
            if(tot <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}