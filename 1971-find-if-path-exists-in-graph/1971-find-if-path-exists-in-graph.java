class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[]=new boolean[n];
        dfs(n,adj,source,destination,vis);
        return vis[destination];
    }
    public static void dfs(int n,ArrayList<ArrayList<Integer>>adj,int source,int destination,boolean vis[]){
        vis[source]=true;
        for(int i:adj.get(source)){
            if(!vis[i]){
                dfs(n,adj,i,destination,vis);
            }
        }
    }
}