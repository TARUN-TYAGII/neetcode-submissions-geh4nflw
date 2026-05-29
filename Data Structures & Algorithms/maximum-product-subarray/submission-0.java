class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int pre=0;
        int suf=0;
        for(int i=0;i<n;i++){
            pre = nums[i]* (pre== 0 ? 1: pre);
            suf = nums[n-1-i] * (suf == 0 ? 1: suf);
            res= Math.max(res, Math.max(pre,suf));
        }
        return res;
    }
}
