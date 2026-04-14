class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        char[] arr = s.toCharArray();
        int n = arr.length;
        int st=0;
        int e=n-1;

        while(st<e){
            if(arr[st] != arr[e]){
                return false;
            }
            st++;
            e--;
        }
        return true;

        
    }
}
