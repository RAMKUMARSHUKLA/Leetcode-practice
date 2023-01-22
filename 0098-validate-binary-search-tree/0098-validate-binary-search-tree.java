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
       return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public static Boolean isValidBST(TreeNode root,long minVal,long maxVal)
    {
        if(root==null)
        {
            return true;
        }
        
        if(root.val>=maxVal || root.val<=minVal)
            return false;
        //go to left and make new root value
        return isValidBST(root.left,minVal,root.val) && isValidBST(root.right,root.val,maxVal);
    }
}