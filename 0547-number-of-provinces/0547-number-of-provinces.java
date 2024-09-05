class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;
        
        for(int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }
        
        return provinces;
    }
    
    public void dfs(int[][] isConnected, boolean[] visited, int start) {
        visited[start] = true;
        
        for(int i = 0; i < isConnected.length; i++) {            
            if(isConnected[start][i] == 1 && !visited[i]) {
                dfs(isConnected, visited, i);
            }
        }
    }
}