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
        int[] starts = new int[intervals.size()];
        int[] ends = new int[intervals.size()];
        int count = 0, res = 0,strPtr = 0,endPtr=0;

        Collections.sort(intervals,Comparator.comparingInt(i->i.start));

        for(int i=0;i<intervals.size();i++){
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);
        
        while(strPtr<starts.length && endPtr<ends.length){
            if(starts[strPtr]<ends[endPtr]){
                strPtr++;
                count++;
            }
            else{
                endPtr++;
                count--;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
