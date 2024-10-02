class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = -1, cnt = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == majorityElement) {
                cnt++;
            } else {
                if(cnt == 0) {
                    majorityElement = nums[i];
                } else {
                    cnt--;
                }
            }
        }
        return majorityElement;
    }
}