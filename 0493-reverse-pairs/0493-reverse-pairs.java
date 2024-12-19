class Solution {
    public void merge(int[] nums, int l, int m, int h) {
        int lt = l, rt = m + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(lt <= m && rt <= h) {
            if(nums[lt] <= nums[rt]) {
                temp.add(nums[lt]);
                lt++;
            } else {
                temp.add(nums[rt]);
                rt++;
            }
        }
        
        
        while(lt <= m) {
            temp.add(nums[lt]);
            lt++;
        }
        
        while(rt <= h) {
            temp.add(nums[rt]);
            rt++;
        }
        
        
        for(int i = l; i <= h; i++) {
            nums[i] = temp.get(i - l);
        }
    }
    
    
    public int countPairs(int[] nums, int l, int m, int h) {
        int cnt = 0, rt = m + 1;
        
        for(int i = l; i <= m; i++) {
            while(rt <= h && (long) nums[i] > 2L * nums[rt]) {
                rt++;
            }
            
            cnt += (rt - (m + 1));
        }
        
        return cnt;
    }
    
    
    public int mergeSort(int[] nums, int l, int h) {
        int cnt = 0;
        if(l >= h) return cnt;
        
        int m = (l + h) / 2;
        
        cnt += mergeSort(nums, l, m);
        cnt += mergeSort(nums, m + 1, h);
        cnt += countPairs(nums, l, m, h);
        merge(nums, l, m , h);
        
        return cnt;
    }
    
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        
        cnt += mergeSort(nums, 0, n - 1);
        
        return cnt;
    }
}