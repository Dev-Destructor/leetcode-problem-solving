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
public class TreeInfo {
    int height;
    int diameter;
    
    public TreeInfo(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
}

class Solution {
    public TreeInfo dB(TreeNode root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }
        
        TreeInfo t1 = dB(root.left);
        TreeInfo t2 = dB(root.right);
        
        int h = Math.max(t1.height, t2.height) + 1;
        
        return new TreeInfo(h, Math.max(Math.max(t1.diameter, t2.diameter), t1.height + t2.height));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        TreeInfo ans = dB(root);
        
        return ans.diameter;
    }
}