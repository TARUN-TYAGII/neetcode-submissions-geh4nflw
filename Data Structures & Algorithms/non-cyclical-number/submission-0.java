class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(!seen.contains(n)){
            seen.add(n);
            n = sumOfSqr(n);
            if(n==1){
                return true;
            }
        }
        return false;        
    }

    public int sumOfSqr(int n){
        int ans =0;
        while(n>0){
            int digit = n % 10;
            digit *= digit;
            ans+=digit;
            n /=10;
        }
        return ans;
    }
}
