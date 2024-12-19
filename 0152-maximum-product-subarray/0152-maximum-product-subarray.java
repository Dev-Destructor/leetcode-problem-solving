class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length, ans = Integer.MIN_VALUE, p = 1, s = 1;
        
        for (int i = 0; i < n; i++) {
            if(p == 0) p = 1;
            if(s == 0) s = 1;
            
            p = p * nums[i];
            s = s * nums[n - i - 1];
            
            ans = Math.max(ans, Math.max(p, s));
        }
            
            
        return ans;
    }
}