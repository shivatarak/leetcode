class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>>adj=new ArrayList<>();
        int n=numCourses;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            //adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int a:adj.get(i)){
                indegree[a]++;
            }
        }
        boolean vis[]=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int a[]=new int[n];
        int i=0;
        while(!q.isEmpty()){
            int node=q.poll();
            a[i]=node;
            i++;
            for(int neigh:adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        if (i != n) {
            return new int[0];
        }
        return a;
    }
}