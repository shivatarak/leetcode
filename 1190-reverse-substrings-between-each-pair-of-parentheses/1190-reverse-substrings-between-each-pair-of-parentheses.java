class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        int a[]=new int[n];
        Arrays.fill(a,-1);
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                int open=st.pop();
                a[open]=i;
                a[i]=open;
            }
        }
        StringBuilder k=new StringBuilder();
        int dir=1;
        for(int i=0;i<n;i+=dir){
            char ch=s.charAt(i);
            if(ch=='(' || ch==')'){
                i=a[i];
                dir*=-1;
            }
            else{
                k.append(ch);
            }
        }
        return k.toString();
    }
}