class Solution {

    private double myPowerHelper(double x, long n){
        if(n==0) return 1.0;
        double y = myPowerHelper(x,n/2);
        if(n%2==0){
            return y*y;
        }else{
            return x*y*y;
        }
    }
    public double myPow(double x, int n) {
        if(x==0) return 0.0;
        if(n==0) return 1.0;
        long N = n;

        if(N<0){
            return 1.0/myPowerHelper(x, -N);
        }else{
            return myPowerHelper(x,N);
        }
        
    }
}
