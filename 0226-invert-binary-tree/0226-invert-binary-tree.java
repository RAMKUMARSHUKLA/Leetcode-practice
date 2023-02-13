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
    public TreeNode invertTree(TreeNode root) {
          if(root==null) return null;
        //step 2
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //step 3
        invertTree(root.left);
        invertTree(root.right);
        //step 4
        return root;
    }
}