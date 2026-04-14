class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans =0;
        int l=0;
        int r=1;

        while(r < n){
            if(prices[r]> prices[l]){
                ans = Math.max(ans, prices[r] - prices[l]);
            }else{
                l=r;
            }
            r++;
        }
        return ans;
        
    }
}

