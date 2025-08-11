class Solution {
    private boolean possibleBouquets(int[] bloomDay, int m, int k, int n, int day){
        int count = 0;
        int bouquets = 0;
        for(int i=0; i<n; i++){
            if(bloomDay[i] <= day){
                count++;
            }else {
                bouquets += count / k;
                if(bouquets == m){
                    return true;
                }
                count = 0;
            }

            
        }

        bouquets += count / k;
        return bouquets >= m;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m*k){
            return -1;
        }
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            low = (low < bloomDay[i]) ? low : bloomDay[i];
            high = (high < bloomDay[i]) ? bloomDay[i] : high;
        }
        int ans = -1;
        while(low <= high){
            mid = (low+high)/2;
            boolean isPos = possibleBouquets(bloomDay, m, k, n, mid);
            if(isPos){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid +1;
            }
        }

        return ans;
    }
}