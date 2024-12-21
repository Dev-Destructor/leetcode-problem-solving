class Solution {
    public int totalHours(int[] piles, int n, int m) {
        int th = 0;

        for(int i = 0; i < n; i++) {
            th += Math.ceil((double)piles[i] / (double)m);
        }
        
        return th;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = piles[0];
        
        for(int i = 1; i < n; i++) {
            max = Math.max(piles[i], max);
        }
        
        int lo = 0, hi = max;
        
        while(lo <= hi) {
            int m = (lo + hi) / 2;
            
            int th = totalHours(piles, n, m);
            
            if(th <= h) {
                hi = m - 1;
            } else {
                lo = m + 1;
            }
        }
        
        return lo;
    }
}