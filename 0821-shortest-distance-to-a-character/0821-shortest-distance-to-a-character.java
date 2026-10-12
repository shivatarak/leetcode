class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int a[]=new int[n];
        List<Integer>l=new ArrayList<>();
        int i=0;
        while(i<n){
            if(s.charAt(i)==c){
                a[i]=0;
                l.add(i);
            }
            i++;
        }
        for(i = 0; i < n; i++) {
            int min = n;
            for(int j = 0; j < l.size(); j++) {
                int k = Math.abs(i - l.get(j));
                min = Math.min(min, k);
            }
            a[i] = min;
        }
        return a;
    }
}