class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1, p = 0;
        
        if(target < nums[0]) {
            return 0;
        }
        
        if(target > nums[n - 1]) {
            return n;
        }
        
        while(l <= h) {
            int m = (l + h) / 2;
            
            if(nums[m] == target) {
                return m;
            } else if(nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        
        return l;
    }
}