class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<deck.length;i++){
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int gcd=0;
        for (int freq : map.values()) {
            gcd=g(gcd,freq);
        }
        return gcd>=2;
    }
    public int g(int a,int b){
        if(b==0){
            return a;
        }
        return g(b,a%b);
    }
}