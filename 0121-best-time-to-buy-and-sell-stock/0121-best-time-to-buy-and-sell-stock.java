class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit=0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
}