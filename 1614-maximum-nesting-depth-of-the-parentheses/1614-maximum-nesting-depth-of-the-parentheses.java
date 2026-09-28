class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int d=0;
        int k=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                d++;
            }
            else if(ch==')'){
                d--;
            }
            k=Math.max(k,d);
        }
        return k;
    }
}