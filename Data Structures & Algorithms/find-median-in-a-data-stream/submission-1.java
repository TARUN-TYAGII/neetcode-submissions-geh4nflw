class MedianFinder {
    List<Integer> ans;
    public MedianFinder() {
        ans = new ArrayList<>();
    }
    
    public void addNum(int num) {
        ans.add(num);
    }
    
    public double findMedian() {
        Collections.sort(ans);
        int mid = ans.size()/2;
        boolean isEven = ans.size()%2==0;

        if(isEven){
            return (ans.get(mid) + ans.get(mid-1))/2.0;
        }
        return ans.get(mid);
    }
}
