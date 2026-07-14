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
        return dfs(n,adj,source,destination,vis);
    }
    public static boolean dfs(int n,ArrayList<ArrayList<Integer>>adj,int source,int destination,boolean vis[]){
        if(source == destination){
            return true;
        }
        vis[source]=true;
        for(int i:adj.get(source)){
            if(!vis[i]){
                if(dfs(n,adj,i,destination,vis)){
                return true;
                }
            }
        }
        return false;
    }
}