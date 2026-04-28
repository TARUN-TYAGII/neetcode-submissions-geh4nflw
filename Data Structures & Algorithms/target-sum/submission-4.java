class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,0,0,target);
    }
    public int helper(int[] nums, int i, int sum, int tar){
        if(i==nums.length){
            return sum==tar ? 1: 0;
        }

        int add= helper(nums,i+1,sum+nums[i],tar);
        int sub= helper(nums,i+1,sum-nums[i],tar);
        return add+sub;
    }
}
