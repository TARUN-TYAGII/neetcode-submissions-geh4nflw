class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int s=0;
        int e = n-1;
        int ans=0;

        while(s<e){
            int water = Math.min(heights[s],heights[e]) * (e-s);
            ans = Math.max(water, ans);

            if(heights[s] < heights[e]) s++;
            else e--;
        }
        return ans;

        
    }
}
