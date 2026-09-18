class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int ele : asteroids){
            
            boolean des=false;
            while(!st.isEmpty() && st.peek()>0 && ele<0){
                int top = st.peek();
                if(Math.abs(top) < Math.abs(ele)){
                    st.pop();
                }else if(Math.abs(top) == Math.abs(ele)){
                    st.pop();
                    des=true;
                    break;
                }else{
                    des=true;
                    break;
                }
            }
            if(!des){
                st.push(ele);
            }
        }

        int[] ans = new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i] = st.get(i);
        }
        return ans;
    }
}