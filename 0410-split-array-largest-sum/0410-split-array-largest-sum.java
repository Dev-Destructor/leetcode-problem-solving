class Solution {
    public int getSubArrays(int[] nums, int n, int sum) {
        int subArrays = 1;
        int curSum = 0;
        
        for(int i = 0; i < n; i++) {
            if(curSum + nums[i] <= sum) {
                curSum += nums[i];
            } else {
                subArrays++;
                curSum = nums[i];
            }
        }
        
        return subArrays;
    }
    
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(k > n) {
            return -1;
        }
        
        int l = nums[0], h = nums[0];
        
        for(int i = 1; i < n; i++) {
            l = Math.max(l, nums[i]);
            h += nums[i];
        }
        
        while(l <= h) {
            int m = (l + h) / 2;
            int subArrays = getSubArrays(nums, n, m);
            
            if(subArrays > k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        
        return l;
    }
}