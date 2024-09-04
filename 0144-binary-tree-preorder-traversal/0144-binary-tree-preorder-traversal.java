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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        
        return traversal(root, new ArrayList<>());
    }
    
    public List<Integer> traversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return null;
        }
        
        list.add(root.val);
        traversal(root.left, list);
        traversal(root.right, list);
        
        return list;
    }
}