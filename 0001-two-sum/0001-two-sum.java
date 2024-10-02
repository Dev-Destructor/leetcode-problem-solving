class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int remainingIndex = map.getOrDefault(target - nums[i], -1);
            if(remainingIndex != -1) {
                return new int[]{i, remainingIndex};
            } else {
                map.put(nums[i], i);
            }
        }
        
        return new int[]{0,0};
    }
}