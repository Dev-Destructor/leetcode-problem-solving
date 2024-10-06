class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int bp = -1;
        
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                bp = i;
                break;
            }
        }
        
        if(bp == -1) {
            Arrays.sort(nums);
            return;
        }
        
        for(int i = n - 1; i > bp; i--) {
            if(nums[i] > nums[bp]) {
                swap(nums, bp, i);
                break;
            }
        }
        
        int i = bp + 1;
        int j = n - 1;
        
        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}