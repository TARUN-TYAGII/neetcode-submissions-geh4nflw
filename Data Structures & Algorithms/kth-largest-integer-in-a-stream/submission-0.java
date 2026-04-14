class KthLargest {
    PriorityQueue<Integer> mh;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k =k;
        this.mh = new PriorityQueue<>();

        for(int num:nums){
            mh.add(num);
            if(mh.size()>k){
                mh.poll();
            }
        }
        
    }
    
    public int add(int val) {
        mh.add(val);
        if(mh.size()>k){
            mh.poll();
        }
        return mh.peek();
    }
}
