class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            int from=flights[i][0];
            int to=flights[i][1];
            int wt=flights[i][2];
            adj.get(from).add(new int[]{to,wt});
        }
        Queue<int[]>q=new LinkedList<>();
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        q.offer(new int[]{0,src,0});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int stopsTaken = curr[0];
            int node = curr[1];
            int cost = curr[2];
            if (stopsTaken > k)
                continue;
            for (int[] nbrInfo : adj.get(node)) {
                int nbr = nbrInfo[0];
                int wt = nbrInfo[1];
                int newCost = cost + wt;
                if (newCost < dist[nbr]) {
                    dist[nbr] = newCost;
                    q.offer(new int[]{stopsTaken + 1, nbr, newCost});
                }
            }
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];    
    }
}