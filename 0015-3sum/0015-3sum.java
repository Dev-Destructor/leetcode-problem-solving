class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int j = i + 1, k = n - 1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    
                    while(j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    
                    while(j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        
        return ans;
    }
}

// 3 pointers i = 0, j = i + 1, k = n -1;
// check sum is 0 or not
// > 0 reduce k / < 0 increase j till j < k
// if 0 then add a list of i j k into the list of list 
// increase j and decrease k
// if j is same with previous / k is same with previouse move pointer till j < k