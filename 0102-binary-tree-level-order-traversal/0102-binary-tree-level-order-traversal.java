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
        
      //Using DFS to traverse all the node
        List<List<Integer>> res = new ArrayList<>();
        //base case
        if (root == null)
            return res;
        visit(res, root, 0);
        return res;
    }
	
	public void visit(List<List<Integer>> res, TreeNode root, int level) {
		if (root == null)
			return;
		List<Integer> curr;
		if (level >= res.size()) {
            //reach the new level, create a new list to add in res
			curr = new ArrayList<>();
			curr.add(root.val);
			res.add(curr);
		} else {
            //level already visited
			curr = res.get(level); 
			curr.add(root.val); 
		}
        //visit children
		visit(res, root.left, level + 1);
		visit(res, root.right, level + 1);
	}
}