class Solution {
    public int maxProfit(int[] prices) {
        
        int minprofit = Integer.MAX_VALUE;
        int maxprofit = 0;

        for( int price : prices){

            minprofit = Math.min(minprofit, price);

            maxprofit = Math.max( maxprofit, price - minprofit);

        }
        return maxprofit;
    }
}