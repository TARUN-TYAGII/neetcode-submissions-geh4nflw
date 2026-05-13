class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans=0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,1)+1);
        }

        for(int num: nums){
            int freq = map.get(num);
            if(freq > nums.length/2){
                ans = num;
                break;
            }
        }
        
        return ans;
    }
}