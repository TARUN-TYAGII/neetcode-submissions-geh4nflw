class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mh = new PriorityQueue<>((a,b)-> b-a);
        for(int num : stones){
            mh.add(num);
        }

        while(mh.size()>1){
            int f = mh.poll();
            int s = mh.poll();

           if(f!=s){
            mh.add(f-s);
           }
        }

        return mh.isEmpty() ? 0 : mh.peek();
    }
}
