class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        if(set.size() == n){
            return false;
        }
        return true;
        
    }
}