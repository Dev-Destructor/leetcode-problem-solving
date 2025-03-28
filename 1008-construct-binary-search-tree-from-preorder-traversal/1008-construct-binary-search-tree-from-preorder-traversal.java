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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode();
        
        root.val = preorder[0];
        
        for(int i = 1; i < preorder.length; i++) {
            root = bst(root, preorder[i]);
        }
        
        return root;
    }
    
    public TreeNode bst(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        
        if(root.val > val) {
            root.left = bst(root.left, val);
        } else {
            root.right = bst(root.right, val);
        }
        
        return root;
    }  
}