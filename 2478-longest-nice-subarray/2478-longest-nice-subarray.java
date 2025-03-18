class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length, usedBits = 0, right = 0, left = 0, maxLen = 0;

        while(right < n){
            while((usedBits & nums[right]) != 0){
                usedBits ^= nums[left];
                left++;
            }

            usedBits |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}