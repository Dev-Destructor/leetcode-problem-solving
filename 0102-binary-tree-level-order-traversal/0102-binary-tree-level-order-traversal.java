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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int n = q.size();
            
            for(int i = 0; i < n; i++) {
                TreeNode currentNode = q.remove();
                level.add(currentNode.val);
                
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
            
            ans.add(level);
        }
        
        return ans;
        
    }
}