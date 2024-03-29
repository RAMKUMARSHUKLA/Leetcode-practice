/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
     if(node==null)
     {
         return null;
     }
        Map<Node,Node> visited=new HashMap<>();
        return dfsClone(node,visited);
    }
    public Node dfsClone(Node node,Map<Node,Node> visited)
    {
        if(visited.containsKey(node))
        {
            return visited.get(node);
        }
        
        Node newNode=new Node(node.val);
        visited.put(node,newNode);
        
        for(Node neighbor:node.neighbors)
        {
            Node node1=dfsClone(neighbor,visited);
            newNode.neighbors.add(node1);
        }
        
        return newNode;
    }
    
}