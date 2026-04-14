class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int max = 0;

        for(int i=0;i<=n;i++){

            while(!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])){
                int h = heights[st.pop()];
                int w = st.isEmpty() ? i : i - st.peek() -1;
                max = Math.max(max , h*w);
            }
            st.push(i);
        }
        return max;
        
    }
}
