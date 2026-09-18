class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int ast: asteroids){
            boolean destroyed = false;

            while(!st.isEmpty() && st.peek()>0 && ast<0){
                int top = st.peek();

                if(Math.abs(ast)>Math.abs(top)){
                     st.pop();
                }else if(Math.abs(ast) == Math.abs(top)){
                    st.pop();
                    destroyed = true;
                    break;
                }else{
                    destroyed=true;
                    break;
                }

            }   
            if(!destroyed){
                st.push(ast);
            }
        }
        int[] ans = new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i] = st.get(i);
        }
        return ans;

        
    }
}