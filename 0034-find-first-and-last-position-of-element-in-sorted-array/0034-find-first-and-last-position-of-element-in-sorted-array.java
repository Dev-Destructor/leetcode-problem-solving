class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fI = firstOccurence(nums, target);
        int lI = lastOccurence(nums, target);
        
        return new int[]{fI, lI};
    }
    
    public int firstOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int fO = -1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(nums[mid] == target) {
                fO = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        return fO;
    }
    
    public int lastOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lO = -1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(nums[mid] == target) {
                lO = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return lO;
    }
}