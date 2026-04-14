class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else{
            min.push(Math.min(val, min.peek()));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            min.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        if(min.isEmpty()){
            return -1;
        }
        return min.peek();
    }
}
