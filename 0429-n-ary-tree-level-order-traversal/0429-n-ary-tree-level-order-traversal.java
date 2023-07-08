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
      List<List<Integer>> result = new ArrayList<>();

        if(root==null)
        {
            return new ArrayList<>();
        }
        
        
        
        Queue<Node> queue=new LinkedList<>();  // Making queue of LinkedList type
        queue.offer(root);  //Adding element in queue having val and address
        
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