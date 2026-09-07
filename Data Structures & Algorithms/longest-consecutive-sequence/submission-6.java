class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele: nums){
            set.add(ele);
        }

        int ans=0;

        for(int ele: nums){
            if(!set.contains(ele-1)){
                int start=ele;
                int count=0;
                while(set.contains(start)){
                    start++;
                    count++;
                }
                ans=Math.max(ans, count);
            }
        }
        return ans;
    }
}
