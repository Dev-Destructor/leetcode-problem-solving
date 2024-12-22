class Solution {
    public int getDivisionSum(int[] nums, int n, int div) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += (nums[i] + div - 1) / div;
        }
            
        return sum;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0;
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
        }
        
        int l = 1, h = max;
        
        while(l <= h) {
            int m = (l + h) / 2;
            int sum = getDivisionSum(nums, n, m);
            
            if(sum <= threshold) {
                ans = Math.min(ans, m);
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        
        return ans;
    }
}