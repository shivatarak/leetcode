class Solution {
    public String smallestString(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n&&s.charAt(i)=='a'){
            sb.append(s.charAt(i));
            i++;
        }
        if(i==n){
            sb.setCharAt(n-1,'z');
            return sb.toString();
        }
        while(i<n){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(idx==0){
                break;
            }
            idx=idx-1;
            char l=(char)(idx+'a');
            sb.append(l);
            i++;
        }
        while(i<n){
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}