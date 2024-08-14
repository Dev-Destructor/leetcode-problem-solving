class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length - 1;
        int j = -1;
        
        for (int k = 0; k <= n; k++) {
            if (nums[k] == 0) {
                j = k;
                break;
            }
        }
        
        if (j == -1) {
            return;
        }
        
        for(int i = j + 1; i <= n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            
        }
    }
}