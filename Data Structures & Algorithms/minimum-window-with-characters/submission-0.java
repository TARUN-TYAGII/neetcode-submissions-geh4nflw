class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int[] map = new int[128];
        for(char c : t.toCharArray()){
            map[c]++;
        }

        int n = s.length();
        int left=0;
        int right=0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length();
        int start=0;

        while(right < s.length()){
            char r = s.charAt(right);
            if(map[r]>0){
                count--;
                
            }
            map[r]--;
            right++;

            while(count==0){
                if(right-left < minLen){
                    minLen = right-left;
                    start=left;
                }
                char l = s.charAt(left);
                map[l]++;
                if(map[l]>0) count++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen); 
    }
}
