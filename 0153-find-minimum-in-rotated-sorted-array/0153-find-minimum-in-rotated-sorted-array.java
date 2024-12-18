class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        int l = 0, h = n - 1;
        
        while(l <= h) {
            int m = (l + h) / 2;
            
            if(nums[m] < min) {
                min = nums[m];
            }
            
            if(nums[l] < nums[m]) {
                if(nums[l] <= min) {
                    min = nums[l];
                }
                l = m + 1;
            } else {
                if(nums[h] <= min) {
                    min = nums[h];
                }
                h = m - 1;
            }
        }
        return min;
    }
}