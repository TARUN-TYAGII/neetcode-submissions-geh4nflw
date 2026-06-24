class Solution {
    public int findDuplicate(int[] nums) {
        int ans=-1;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                ans = num;
            }
            set.add(num);
        }
        return ans;
    }
}
