class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans =0;

        for(int i=0;i<n;i++){
            int buy = prices[i];
            int lm = 0;
            for(int j=i+1;j<n;j++){
                lm = Math.max(lm, prices[j]);
            }
            ans = Math.max(ans , lm - buy);
        }
        return ans;
        
    }
}

