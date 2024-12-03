class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1;
        
        while(l <= h) {
            int m = (l + h) / 2;
            
            if(nums[m] == target) {
                int fo = m, lo = m, cm = m;
                while(m != 0 && nums[m - 1] == nums[m]) {
                    m--;
                }
                fo = m;
                
                while(cm != n - 1 && nums[cm] == nums[cm + 1]) {
                    cm++;
                }
                lo = cm;
                
                return new int[] {fo, lo};
                
            } else if(nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        
        return new int[] {-1, -1};
    }
}