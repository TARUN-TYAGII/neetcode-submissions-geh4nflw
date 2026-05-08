/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a,b) -> a.start - b.start);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans=0;

        for(Interval interval : intervals){
            while (!pq.isEmpty() && pq.peek() <= interval.start){
                pq.poll();
            }
            pq.add(interval.end);
            ans=Math.max(ans,pq.size());
        }
        return ans;

    }
}
