class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int fI = -1;
        int lI = -1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(nums[mid] == target) {
                fI = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        if(fI != -1) {
            for(int i = fI; i < nums.length; i++) {
                if(nums[i] != target) {
                    break;
                }
            
                lI = i;
            }
        }
        
        
        
        return new int[]{fI, lI};
    }
}

// if mid value > target -> did not occured in the left half
// if mid value < target -> nothing occured in the right half
// if mid value == target 