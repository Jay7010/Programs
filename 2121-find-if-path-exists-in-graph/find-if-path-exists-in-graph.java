class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       boolean[] vis = new boolean[n];
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
       for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u); // because it's undirected
        }
        return path(graph, source, destination, vis);

        
    }
    boolean path( ArrayList<ArrayList<Integer>> edges , int curr, int dest,boolean[] vis ){
        if(curr== dest) return true;
        if(vis[curr]) return false;
        vis[curr]= true;
        for(int edg: edges.get(curr)){
            if(path(edges, edg, dest, vis)){
                return true;
            }
        }

        return false;
    }
}