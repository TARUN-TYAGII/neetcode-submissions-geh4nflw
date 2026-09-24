class Solution {
    public int characterReplacement(String s, int k) {
       Map<Character,Integer> map = new HashMap<>();
       int ans=0;
       int maxf=0;
       int left=0;

       for(int right=0;right<s.length();right++){
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r,0)+1);
            maxf = Math.max(maxf, map.get(r));

            while((right-left+1 - maxf) > k){
                char l = s.charAt(left);
                map.put(l, map.get(l)-1);
                left++;
            }
            ans = Math.max(ans, right-left+1);
       }    
       return ans;
    }
}
