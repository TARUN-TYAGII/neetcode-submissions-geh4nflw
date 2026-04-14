class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        int ans = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int y=num;
                int length=0;
                while(set.contains(y)){
                    y++;
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }

        return ans;
        
    }
}
