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
 
  if(root==null) return;
        
        inOrder(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
            return;
        }
        inOrder(root.right,k);
 */
class Solution {
    int ans=0;
    int count=0;
    
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
    public void inorder(TreeNode root, int k)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left,k);
        count++;
        if(count==k)
        {
            ans=root.val;
        }
        inorder(root.right,k);
    }
}