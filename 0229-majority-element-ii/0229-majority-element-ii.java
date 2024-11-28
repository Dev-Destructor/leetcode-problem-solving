class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int m = (int) ((n / 3) + 1);
        
        for(int i = 0; i < n; i++) {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], ++val);
            
            if(map.get(nums[i]) == m) {
                ans.add(nums[i]);
            }
            
            if (ans.size() == 2) break;
        }
        
        return ans;
    }
}
