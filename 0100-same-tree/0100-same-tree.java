/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        
        if(p == null && q != null || q == null && p != null || p.val != q.val) {
            return false;
        }
        
        boolean same = false;
        
        
        
        boolean lV = isSameTree(p.left, q.left);
        boolean rV = isSameTree(p.right, q.right);
        
        if (lV == true && rV == true) {
            same = true;
        }
        
        return same;
        
    }
}