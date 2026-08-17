class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        int h=0;
        int max=0;
        for(int i=0;i<n;i++){
            h=n-i;
            if(h<=citations[i]){
                max=Math.max(max,h);
            }
        }
        return max;
    }
}