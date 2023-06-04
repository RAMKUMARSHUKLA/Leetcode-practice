class Solution {
    public int findCircleNum(int[][] isConnected) {
//             int n = isConnected.length;
//         int provinces = 0;
//         boolean[] visited = new boolean[n];

//         for (int i = 0; i < n; i++) {
//             if (!visited[i]) {
//                 provinces++;
//                 dfs(isConnected, visited, i);
//             }
//         }

//         return provinces;
//     }

//     private void dfs(int[][] isConnected, boolean[] visited, int node) {
//         visited[node] = true;
//         for (int neighbor = 0; neighbor < isConnected.length; neighbor++) {
//             if (isConnected[node][neighbor] == 1 && !visited[neighbor]) {
//                 dfs(isConnected, visited, neighbor);
//             }
//         }
        
        int n=isConnected.length;
        int province=0;
        boolean isVisited[]=new boolean[n];
        
        for(int i=0;i<n;i++)
        {
            if(!isVisited[i])
            {
                province++;
                dfs(isConnected,isVisited,i);
            }
        }
        return province;
    }
    public static void dfs(int[][] isConnected,boolean isVisited[], int node)
    {
        isVisited[node]=true;
        
        for(int neighbour=0; neighbour<isConnected.length; neighbour++)
        {
          if(isConnected[node][neighbour]==1 && !isVisited[neighbour])
          {
              dfs(isConnected,isVisited,neighbour);
          }
        }
       
    }
}