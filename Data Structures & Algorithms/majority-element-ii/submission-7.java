class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

       for(int key: map.keySet()){
        if(map.get(key) > n ){
            ans.add(key);
        }
       }
       return ans;
    }
}