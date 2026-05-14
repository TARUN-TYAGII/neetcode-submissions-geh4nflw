class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int res=0;

        for(String s : operations){
            if(s.equals("+")){
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
                res += newTop;
            }else if(s.equals("D")){
                st.push(2 * st.peek());
                res += st.peek();
            }else if(s.equals("C")){
                res -= st.pop();
            }else{
                st.push(Integer.parseInt(s));
                res += st.peek();
            }
        }   
        return res;
    }
}