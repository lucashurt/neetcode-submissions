class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        if(!dfs(0,-1,adj,visit)){
            return false;
        }
        return visit.size() == n;

    }
    public boolean dfs(int node, int prev, List<List<Integer>> adj, Set<Integer> visit){
        if(visit.contains(node)){
            return false;
        }
        visit.add(node);
        for(int neighbor : adj.get(node)){
            if(neighbor == prev){
                continue;
            }
            if(!dfs(neighbor,node,adj,visit)){
                return false;
            }
        }
        return true;
    }
}
