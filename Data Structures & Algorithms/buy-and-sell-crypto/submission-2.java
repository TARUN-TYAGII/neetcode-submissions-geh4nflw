class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;

        for(int sell: prices){
            min = Math.min(min, sell);
            profit = Math.max(profit, sell -  min);
        }
        return profit;
    }
}
