class Solution {
    public int getMaxNoDays(int[] bloomDay, int n) {
        int maxDay = 0;
        for(int i = 0; i < n; i++) {
            maxDay = Math.max(bloomDay[i], maxDay);
        }
        
        return maxDay;
    }
    
    int getBouquets(int[] bloomDay, int n, int mid, int k) {
        int bouquets = 0;
        int adj = 0;
            
        for(int i = 0; i < n; i++) {
            if(bloomDay[i] <= mid) {
                adj++;
                if(adj == k) {
                    bouquets++;
                    adj = 0;
                }
            } else {
                adj = 0;
            }
        }
        
        return bouquets;
    }
     
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        
        if((double)n < (double)m * k) return -1;
        
        int max = getMaxNoDays(bloomDay, n);      
        
        int l = 0, h = max, ans = Integer.MAX_VALUE;
        
        while(l <= h) {
            int mid = (l + h) / 2;
            
            int bouquets = getBouquets(bloomDay, n, mid, k);
            
            if(bouquets >= m) {
                ans = Math.min(mid, ans);
                h = mid - 1;
            } else {
                l = mid + 1;
            }
            
        }
        
        return ans;
    }
}