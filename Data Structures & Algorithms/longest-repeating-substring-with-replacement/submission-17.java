class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int left=0;
        int maxf=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);
            maxf = Math.max(maxf, map.get(c));

            while((right-left+1) - maxf > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            ans= Math.max(ans, right-left+1);
        }
        return ans;
    }
}
