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
    public boolean isValidBST(TreeNode root) {
        return validSubTree(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    public boolean validSubTree(TreeNode root, long uB, long lB) {
        if(root == null) {
            return true;
        }
        
        if(root.val <= lB || root.val >= uB) {
            return false;
        }
        
        return validSubTree(root.left, root.val, lB) && validSubTree(root.right, uB, root.val);
    }
}