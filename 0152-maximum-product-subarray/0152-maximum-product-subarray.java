class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, ans = nums[0];
        
        for(int i = 0; i < n; i++) {
            int p = nums[i];
            
            for(int j = i + 1; j < n; j++) {
                ans = Math.max(ans, p);
                p = p * nums[j];
            }
            
            ans = Math.max(ans, p);
        }
        
        return ans;
    }
}
