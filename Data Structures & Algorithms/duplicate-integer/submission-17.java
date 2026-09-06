class Solution {
    public boolean hasDuplicate(int[] nums) {
        // ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();

        for(int ele: nums){
            if(set.contains(ele)){
                return true;
            }
            set.add(ele);
        }
        return false;
    }
}