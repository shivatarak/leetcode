class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=0;
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int rec[]:rectangles){
               int s=Math.min(rec[0],rec[1]);
               if(s>max){
                c=1;
                max=s;
               }
               else if(max==s){
                c++;
               }
        }
        return c;
    }
}