class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int mProfit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minPrice;
            mProfit=Math.max(profit, mProfit);
            minPrice=Math.min(minPrice,prices[i]);
            
        }
        return mProfit<0?0:mProfit;
    }
}