class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int n = str.length();
        int i=0;
        while(i<n){
            int j=i;
            while(j < n && str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i=j+1;
            String s = str.substring(i,i+len);
            ans.add(s);
            i=i+len;
        }
        return ans;
    }
}
