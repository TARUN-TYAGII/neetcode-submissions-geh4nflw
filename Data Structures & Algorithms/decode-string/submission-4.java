class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> currStack = new Stack<>();
        int num=0;
        String current="";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num *10 + (c-'0');
            }
            else if(c == '['){
                numStack.push(num);
                currStack.push(current);
                num=0;
                current="";
            }else if(c==']'){
                Integer repeat = numStack.pop();
                String previous = currStack.pop();
                StringBuilder temp = new StringBuilder();
                for(int i=0;i<repeat;i++){
                    temp.append(current);
                }
                current = previous + temp.toString();
            }else{
                current += c;
            }
        }
        return current;
        
    }
}