class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int n = intervals.length;
        int current = 0;
        intervals[current] = intervals[0];
        
        for(int i = 1; i < n; i++) {
            if(intervals[i][0] <= intervals[current][1]) {
                intervals[current][1] = Math.max(intervals[current][1], intervals[i][1]);
            } else {
                current++;
                intervals[current] = intervals[i];
            }
        }
        
        return Arrays.copyOfRange(intervals, 0, current + 1);
    }
}