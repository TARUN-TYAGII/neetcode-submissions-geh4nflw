class Solution {
    public int reverse(int x) {
        long rev = rec(Math.abs(x), 0) * (x < 0 ? -1 : 1);
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
            return 0;
        }
        return (int) rev;
    }

    public long rec(int num , long rev){
        if(num == 0){
            return rev;
        }

        rev = rev*10 + num%10;
        return rec(num/10, rev);
    }
}
