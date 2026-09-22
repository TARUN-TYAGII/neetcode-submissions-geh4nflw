class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] arr = path.split("/");

        for(String c: arr){
            if(c.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else if(!c.equals("") && !c.equals(".")){
                st.push(c);
            }
        }
        return "/" + String.join("/",st);
    }
}