class Solution{
public int networkDelayTime(int[][] times, int n, int k) {
    List<List<int[]>>adj=new ArrayList<>();
    for(int i=0;i<=n;i++){
        adj.add(new ArrayList<>());
    }
    for(int[]edge:times){
        int u=edge[0];
        int v=edge[1];
        int w=edge[2];
        adj.get(u).add(new int[]{v,w});
    }
    List<Integer>dis=new ArrayList<>();
    for(int i=0;i<=n;i++){
        dis.add(Integer.MAX_VALUE);
    }
    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
    dis.set(k,0);
    pq.offer(new int[]{0,k});
    while(!pq.isEmpty()){
        int p[]=pq.poll();
        int currdist=p[0];
        int node=p[1];
        if(currdist>dis.get(node)){
            continue;
        }
        for(int[] i:adj.get(node)){
            int next=i[0];
            int weight=i[1];
            if(currdist+weight<dis.get(next)){
                dis.set(next,currdist+weight);
                pq.offer(new int[]{dis.get(next),next});
            }
        }
    }
    int ans=0;
    for(int i=1;i<=n;i++){
        if(dis.get(i)==Integer.MAX_VALUE){
            return -1;
        }
        ans=Math.max(dis.get(i),ans);
    }
    return ans;
 }
}