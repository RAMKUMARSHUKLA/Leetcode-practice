class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
         List<Integer> result = new ArrayList<>();
        
        if (n == 1) {
            result.add(0);
            return result;
        }
        
        List<Set<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        Queue<Integer> leaves = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (graph.get(i).size() == 1) {
                leaves.offer(i);
            }
        }
        
        while (n > 2) {
            int layerSize = leaves.size();
            n -= layerSize;
            
            for (int i = 0; i < layerSize; i++) {
                int leaf = leaves.poll();
                int neighbor = graph.get(leaf).iterator().next();
                graph.get(neighbor).remove(leaf);
                if (graph.get(neighbor).size() == 1) {
                    leaves.offer(neighbor);
                }
            }
        }
        
        result.addAll(leaves);
        return result;
    }
}