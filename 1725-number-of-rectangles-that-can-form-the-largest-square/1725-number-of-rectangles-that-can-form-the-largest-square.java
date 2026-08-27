class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
                int min=Math.min(rectangles[i][0],rectangles[i][1]);
                max=Math.max(max,min);
                map.put(min,map.getOrDefault(min,0)+1);
        }
        return map.get(max);
    }
}