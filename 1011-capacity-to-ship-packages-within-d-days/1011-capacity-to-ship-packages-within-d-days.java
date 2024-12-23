class Solution {
    public int findDays(int[] weights, int n, int cap) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maxW = 0;
        int sumW = 0;
        
        for(int i = 0; i < n; i++) {
            maxW = Math.max(weights[i], maxW);
            sumW += weights[i];
        }
        
        int l = maxW, h = sumW;
        
        while(l <= h) {
            int m = (l + h) / 2;
            
            int d = findDays(weights, n, m);
            
            if(d <= days) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        
        return l;
    }
}