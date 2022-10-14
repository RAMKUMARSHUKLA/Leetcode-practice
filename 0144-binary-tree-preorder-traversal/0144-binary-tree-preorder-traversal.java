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
        List<Integer> list=new ArrayList<Integer>();
        if(root==null)
        {
            return list;
        }
        return preorder(list,root);
    
    }
    public List preorder(List list,TreeNode root)
    {
        if(root==null)
        {
            return list;
        }
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
        return list;
    }
}