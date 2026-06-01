class Solution {
    public String kthDistinct(String[] arr, int k) {
       HashSet<String> distinct = new HashSet<>();
       HashSet<String> seen = new HashSet<>();

       for(String str: arr){
        if(distinct.contains(str)){
            distinct.remove(str);
            seen.add(str);
        }else if(!seen.contains(str)){
            distinct.add(str);
        }
       }

       for(String s: arr){
        if(distinct.contains(s)){
            k--;
            if(k==0) return s;
        }
       }
       return "";
    }
}