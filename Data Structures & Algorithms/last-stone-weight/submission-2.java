class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>((a,b)-> b-a);
        for(int num: stones){
            max.add(num);
        }

        while(max.size()>1){
            int a = max.poll();
            int b = max.poll();
            max.add(a-b);
        }
        return max.peek();
    }
}
