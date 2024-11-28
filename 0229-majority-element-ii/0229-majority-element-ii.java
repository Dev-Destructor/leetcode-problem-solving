class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, val1 = Integer.MIN_VALUE;
        int cnt2 = 0, val2 = Integer.MIN_VALUE;
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            if(cnt1 == 0 && nums[i] != val2) {
                val1 = nums[i];
                cnt1++;
            } else if (cnt2 == 0 && nums[i] != val1) {
                val2 = nums[i];
                cnt2++;
            } else if (nums[i] == val1) {
                cnt1++;
            } else if (nums[i] == val2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        int m = (int) (n / 3) + 1;
        
        for(int i = 0; i < n; i++) {
            if (nums[i] == val1) {
                cnt1++;
            } else if(nums[i] == val2) {
                cnt2++;
            }
        }
        
        if(cnt1 >= m) {
            ans.add(val1);
        }
        
        if(cnt2 >= m) {
            ans.add(val2);
        }
        
        return ans;
    }
}