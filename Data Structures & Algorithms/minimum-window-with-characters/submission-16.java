class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int start=0;
        int left=0;
        int min= Integer.MAX_VALUE;
        int formed=0;
        HashMap<Character,Integer> need= new HashMap<>();
        HashMap<Character,Integer> window= new HashMap<>();

        for(char c: t.toCharArray()){
            need.put(c, need.getOrDefault(c,0)+1);
        }

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c,0)+1);

            if(need.containsKey(c) && need.get(c).intValue() == window.get(c).intValue()){
                formed++;
            }

            while(need.size() == formed){
                if(right-left+1 < min){
                    min= right-left+1;
                    start=left;
                }

                char lchar = s.charAt(left);
                window.put(lchar, window.get(lchar)-1);

                if(need.containsKey(lchar) && need.get(lchar).intValue() > window.get(lchar).intValue()){
                formed--;
                }
                left++;

            }
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(start, start+min);
        
    }
}
