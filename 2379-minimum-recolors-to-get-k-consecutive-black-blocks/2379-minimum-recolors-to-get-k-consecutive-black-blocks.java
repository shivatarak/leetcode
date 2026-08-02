class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int i=0;
        int j=0;
        int b=Integer.MAX_VALUE;
        int w=0;
        char[] word = blocks.toCharArray();
        while(j<n){
            if(word[j]=='W'){
                    w++;
            }
            if((j-i+1)==k){
                b=Math.min(w,b);
                if(word[i]=='W'){
                    w--;
                }
                i++;
            } 
            j++;
        }
        return b;
    }
}