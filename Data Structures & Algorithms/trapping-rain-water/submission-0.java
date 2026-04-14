class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] pf = new int[n];
        int[] sf = new int[n];
        int ans =0;
        pf[0] = height[0];
        sf[n-1] = height[n-1];

        for(int i=1;i<n;i++){
            pf[i] = Math.max(pf[i-1], height[i]);
        }
        for(int i=n-2;i>=0;i--){
            sf[i] = Math.max(sf[i+1], height[i]);
        }

        for(int i=0;i<n;i++){
            ans += Math.min(pf[i],sf[i]) - height[i];
        }
        return ans;
        
    }
}
