class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        
        map.put(0, 1);
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            int remove = sum - k;
                
            if(map.getOrDefault(remove, 0) != 0) {
                cnt += map.get(remove);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return cnt;
    }
}