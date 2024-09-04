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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        
        return checkNode(root, set, k);
    }
    
    public boolean checkNode(TreeNode root, Set<Integer> set, int k) {
        if(root == null) {
            return false;
        }
        
        if(set.contains(root.val)) {
            return true;
        }
        
        set.add(k - root.val);
        
        return checkNode(root.left, set, k) || checkNode(root.right, set, k);
    }
}