class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pp = 0, np = 1;
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                res[pp] = nums[i];
                pp = pp + 2;
            } else {
                res[np] = nums[i];
                np = np + 2;
            }
        }
        
        return res;
    }
}