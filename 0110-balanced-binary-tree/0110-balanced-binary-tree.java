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
    public boolean isBalanced(TreeNode root) {
    if(root==null) return true;
    if(balanced(root)==-1) return false;
    
    return true;
}
    public int balanced(TreeNode root)
    {
        if(root==null) return 0;
        
        int leftNode=balanced(root.left);
        int rightNode=balanced(root.right);
        
        if(leftNode==-1 || rightNode==-1) return -1;
        if(Math.abs(leftNode-rightNode)>1) return -1;
        else return Math.max(leftNode,rightNode)+1;
    }
}