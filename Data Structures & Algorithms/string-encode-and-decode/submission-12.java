class Solution {

    public String encode(List<String> strs) {
       
        StringBuilder sb = new StringBuilder();
        for(String ele: strs){
            sb.append(ele.length()).append('#').append(ele);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==0) return new ArrayList<>();
        int n = str.length();
        List<String> ans = new ArrayList<>();
        int i=0;

        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            ans.add(str.substring(i,i+length));
            i=i+length;
        }
        return ans;
    }
}
