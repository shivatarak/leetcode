class Solution {

    public int manhattanDistance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public int minCostConnectPoints(int[][] points) {

        int n = points.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        boolean[] mstSet = new boolean[n];

        int mstCost = 0;

        pq.offer(new int[]{0, 0});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int weight = curr[0];
            int node = curr[1];

            if (mstSet[node])
                continue;

            mstSet[node] = true;
            mstCost += weight;

            for (int i = 0; i < n; i++) {

                if (!mstSet[i]) {

                    int dist = manhattanDistance(points[node], points[i]);

                    pq.offer(new int[]{dist, i});
                }
            }
        }

        return mstCost;
    }
}