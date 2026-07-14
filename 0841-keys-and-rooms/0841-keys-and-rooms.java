class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]=new boolean[rooms.size()];
        dfs(rooms,vis,0);
        for(int i=0;i<rooms.size();i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;
    }
    public static void dfs(List<List<Integer>>rooms,boolean[] vis,int started){
        vis[started]=true;
        for(int i:rooms.get(started)){
            if(!vis[i]){
                dfs(rooms,vis,i);
            }
        }
    }
}