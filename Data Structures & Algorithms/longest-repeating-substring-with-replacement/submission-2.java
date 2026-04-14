class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freq = new int[26];
        int left=0;
        int maxCount=0;
        int ans=0;

        for(int right=0;right<n;right++){
            char c = s.charAt(right);
            freq[c-'A']++;

            maxCount = Math.max(maxCount, freq[c-'A']);

            while(right-left+1 - maxCount > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right-left+1);

        }
        return ans;
        
    }
}
