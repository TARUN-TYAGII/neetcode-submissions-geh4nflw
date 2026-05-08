class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> result=new ArrayList<>();
        result.add(intervals[0]);
        int n=intervals.length;

        for(int[] interval:intervals){
            int start=interval[0];
            int end=interval[1];
            int lastEnd= result.get(result.size()-1)[1];
            if(lastEnd>=start){
                result.get(result.size()-1)[1] = Math.max(lastEnd, end);
            }else{
                result.add(new int[]{start,end});
            }
            
        }
        return result.toArray(new int[result.size()][]);
    }
}
