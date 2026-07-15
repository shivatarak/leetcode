class Solution {
    public int findCircleNum(int[][] isConnected) {
     int n=isConnected.length;
     int count=0;
     boolean vis[]=new boolean[n];
     for(int i=0;i<n;i++){
        if(!vis[i]){
            count++;
            dfs(vis,isConnected,i,n);
        }
     }
     return count;   
    }
    public void dfs(boolean[] vis,int[][] isConnected,int start,int n){
        vis[start]=true;
        for(int j=0;j<n;j++){
            if(isConnected[start][j]==1 && !vis[j]){
                dfs(vis,isConnected,j,n);
            }
        }
    }
}