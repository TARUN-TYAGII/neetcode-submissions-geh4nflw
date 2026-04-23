class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right= getMax(piles);

        while(left<right){
            int mid = left + (right-left) /2;

            if(check(piles, h, mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;        
    }

    public boolean check(int[] piles, int h, int k){
        int hour=0;
        for(int pile:piles){
            hour += (long)(pile + k-1)/k;
        }
        return hour <= h;
    }

    public int getMax(int[] piles){
        int max = piles[0];
        for(int pile:piles){
            max=Math.max(max, pile);
        }
        return max;
    }
}
