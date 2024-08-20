class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;
        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        
        if (breakPoint == -1) {
            Arrays.sort(nums);
            return;
        }
        
        for (int i = n - 1; i > breakPoint; i--) {
            if (nums[i] > nums[breakPoint]) {
                int temp = nums[i];
                nums[i] = nums[breakPoint];
                nums[breakPoint] = temp;
                break;
            }
        }
        
        int i = breakPoint + 1;
        int j = n - 1;
        
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
    }
}