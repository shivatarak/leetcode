class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            l.add(i);
        }
        int i=0;
        while(l.size()>1){
            int idx=(i+k-1) % l.size();
            l.remove(idx);
            i=idx;
        }
        return l.get(0);
    }
}