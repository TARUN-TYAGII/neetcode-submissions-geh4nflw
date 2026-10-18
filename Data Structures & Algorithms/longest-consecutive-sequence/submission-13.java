class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele: nums){
            set.add(ele);
        }
        int ans=0;

        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            if(!set.contains(ele-1)){
                int num = ele;
                int count=0;
                while(set.contains(num)){
                    count++;
                    num++;
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
