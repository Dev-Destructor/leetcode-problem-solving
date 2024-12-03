class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        return new int[] {findFirst(nums, n, target), findLast(nums, n, target)};
    }
    
    public int findFirst(int[] nums, int n, int target) {
        int l = 0, h = n - 1, res = -1;
        
        
        while(l <= h) {
            int m = (l + h) / 2;
            if(nums[m] == target) {
                res = m;
                h = m - 1;
            } else if(nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        
        return res;
    }
    
    public int findLast(int[] nums, int n, int target) {
        int l = 0, h = n - 1, res = -1;
        
        
        while(l <= h) {
            int m = (l + h) / 2;
            if(nums[m] == target) {
                res = m;
                l = m + 1;
            } else if(nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        
        return res;
    }
}