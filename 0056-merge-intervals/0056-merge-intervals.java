class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int[][] ans = new int[n][2];
        int current = 0;
        ans[current] = intervals[0];
        
        for(int i = 1; i < n; i++) {
            if(intervals[i][0] <= ans[current][1]) {
                ans[current][1] = Math.max(ans[current][1], intervals[i][1]);
            } else {
                current++;
                ans[current] = intervals[i];
            }
        }
        
        return Arrays.copyOfRange(ans, 0, current + 1);
    }
}