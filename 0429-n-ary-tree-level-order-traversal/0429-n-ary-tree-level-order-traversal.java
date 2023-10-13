/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
     List<List<Integer>> result=new ArrayList<>();
     Queue<Node> queue=new LinkedList<>();
     if(root==null)
     {
         return result;
     }
     queue.offer(root);
     
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node node=queue.poll();
                level.add(node.val);
                queue.addAll(node.children);
            }
            result.add(level);
        }
        return result;
        
    }
}