class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<int[]> min = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(Map.Entry<Integer,Integer> item : map.entrySet()){
            min.add(new int[]{item.getValue(), item.getKey()});
            if(min.size()>k){
                min.poll();
            }
        }
        int[] ans = new int[k];
        int i=0;
        for(int j=0;j<k;j++){
            ans[i++]= min.poll()[1];
        }
        return ans;
    }
}
