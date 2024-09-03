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
    public int num = 0;
    
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        count(root);
        
        return num;
    }
    
    public void count(TreeNode root){
        if (root == null) {
            return;
        }
        
        num++;
        count(root.left);
        count(root.right);
    }
}