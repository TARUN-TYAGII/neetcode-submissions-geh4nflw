class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();    
        int start=0;
        int left=0;
        int min = Integer.MAX_VALUE;
        int formed=0;

        for(char c : t.toCharArray()){
            need.put(c, need.getOrDefault(c,0)+1);
        }

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c,0)+1);
            if(need.containsKey(c) && need.get(c).intValue()==window.get(c).intValue()){
                formed++;
            }

            while(need.size()==formed){
                if(right-left+1 < min){
                    min = right - left +1;
                    start = left;
                }
                char lc = s.charAt(left++);
                window.put(lc, window.get(lc)-1);
                if(need.containsKey(lc) && need.get(lc).intValue() > window.get(lc).intValue()){
                    formed--;
                }
            }
        }

        if(min==Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start, start+min);

        
    }
}
