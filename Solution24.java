class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> all_paths = new ArrayList();
        
        dfs(graph, 0, graph.length-1, new ArrayList(), all_paths);
        
        return all_paths;
    }
    
    private void dfs(int[][] graph, int src, int dest, List<Integer> path, List<List<Integer>> all_paths) {
        if(src == dest) 
            all_paths.add(path);
        
        path.add(src);
        
        for(int v : graph[src]) {
            List<Integer> path_new = new ArrayList<>(path);
            
            dfs(graph, v, dest, path_new, all_paths);
        }
    }
}
