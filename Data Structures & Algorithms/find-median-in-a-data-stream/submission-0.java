class MedianFinder {
    ArrayList<Integer> arr;
    public MedianFinder() {
        arr = new ArrayList<>();
    }
    
    public void addNum(int num) {
        arr.add(num);
    }
    
    public double findMedian() {
        Collections.sort(arr);
        boolean isEven = arr.size()%2 == 0;
        int mid = arr.size()/2;
        if(isEven){
            return (arr.get(mid)+arr.get(mid-1))/2.0;
        }
        return arr.get(mid);
    }
}
