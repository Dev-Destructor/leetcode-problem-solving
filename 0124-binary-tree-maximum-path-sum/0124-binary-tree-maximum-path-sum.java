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
    public int sum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        height(root);
        
        return sum;
    }
    
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int left = Math.max(0, height(root.left));
        int right = Math.max(0, height(root.right));
        
        sum = Math.max(sum, left + right + root.val);
        
        return root.val + Math.max(left, right);
    }
}