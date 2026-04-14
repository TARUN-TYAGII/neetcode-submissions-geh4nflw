class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        int win = s1.length();
        int n= s2.length();
       if(s1.length() > s2.length()) return false;

       int[] freqA = new int[26];
       int[] freqB = new int[26];
       for(int i=0;i<s1.length();i++){
            freqA[s1.charAt(i)-'a']++;
       }

       for(int i=0;i<win;i++){
            freqB[s2.charAt(i)-'a']++;
       }

       if(Arrays.equals(freqA, freqB)) return true;

       for(int i=win;i<n;i++){
        freqB[s2.charAt(i-win)-'a']--;
        freqB[(s2.charAt(i)) - 'a']++;
       if(Arrays.equals(freqA, freqB)) return true;
       }
       return false;
    }
}
