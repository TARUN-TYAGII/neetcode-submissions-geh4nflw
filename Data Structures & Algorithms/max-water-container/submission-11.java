class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int p1=0;
        int p2=n-1;
        int ans=0;

        while(p1<p2){
            ans = Math.max(ans, Math.min(heights[p1],heights[p2]) * (p2-p1));
            if(heights[p1] < heights[p2]) p1++;
            else p2--;
        }
        return ans;
    }
}
