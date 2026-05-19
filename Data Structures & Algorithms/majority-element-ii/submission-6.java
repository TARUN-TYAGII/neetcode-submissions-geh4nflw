class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num: nums){
            if(map.get(num)> nums.length/3){
                set.add(num);
            }
        }
        return new ArrayList<>(set);
    }
}