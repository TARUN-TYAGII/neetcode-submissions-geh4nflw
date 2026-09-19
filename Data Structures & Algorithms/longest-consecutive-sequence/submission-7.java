class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans=0;

        for(int ele: nums){
            set.add(ele);
        }        

        for(int ele:nums){
            if(!set.contains(ele-1)){
                int count=0;
                int start=ele;

                while(set.contains(start)){
                    count++;
                    start++;
                }
                ans=Math.max(ans,count);
            }

        }
        return ans;
    }
}
