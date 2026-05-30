class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> min = new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            min.add(new int[]{ent.getValue(), ent.getKey()});
            if(min.size()>k){
                min.poll();
            }
        }
        int i=0;
        int ans[] = new int[min.size()];
        while(!min.isEmpty()){
            ans[i++]=min.poll()[1];
        }
        return ans;

    }
}
