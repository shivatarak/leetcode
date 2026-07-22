class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer>com=new ArrayList<>();
                dfs(i,vis,adj,com);
                int size=com.size();
                boolean c=true;
                for(int node:com){
                    if(adj.get(node).size()!=size-1){
                        c=false;
                        break;
                    }
                }
                if(c){
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int node,boolean[] vis,List<List<Integer>>adj,List<Integer>com){
        vis[node]=true;
        com.add(node);
        for(int k:adj.get(node)){
            if(!vis[k]){
                dfs(k,vis,adj,com);
            }
        }
    }
}