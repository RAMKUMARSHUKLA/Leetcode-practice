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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        if(root==null)
        {
            return list;
        }
       return inorder(list,root);
    }
    public List inorder(List list,TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
        return list;
    }
}