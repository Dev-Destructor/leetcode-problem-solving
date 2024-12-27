class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length; 
        int n = n1 + n2;
        
        if(n1 > n2) return findMedianSortedArrays(nums2, nums1);
        
        int lh = (n + 1) / 2;
        int l = 0, h = n1;
        
        while(l <= h) {
            int m1 = (l + h) / 2;
            int m2 = lh - m1;
            
            int l1 = (m1 > 0) ? nums1[m1 - 1] : Integer.MIN_VALUE;
            int l2 = (m2 > 0) ? nums2[m2 - 1] : Integer.MIN_VALUE;
            int r1 = (m1 < n1) ? nums1[m1] : Integer.MAX_VALUE;
            int r2 = (m2 < n2) ? nums2[m2] : Integer.MAX_VALUE;
            
            if(m2 < n2) r2 = nums2[m2];
            
            if(l1 <= r2 && l2 <= r1) {
                if(n % 2 == 0) {
                    return (double)(Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }
            
            if(l1 > r2) {
                h = m1 - 1;
            } else {
                l = m1 + 1;
            }
        }
        return 0;
    }
}