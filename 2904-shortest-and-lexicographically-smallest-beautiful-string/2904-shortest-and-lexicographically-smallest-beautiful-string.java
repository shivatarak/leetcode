class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int one=0;
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        while(j<n){
            char ch=s.charAt(j);
            if(ch=='1'){
                one++;
            }
            sb.append(ch);
            while(one==k){
                if(min>sb.length() ||  (sb.length() == min && sb.toString().compareTo(sb1.toString()) < 0)){
                    sb1.setLength(0);
                    sb1.append(sb);
                    min=sb.length();
                }
                char ch1=s.charAt(i);
                if(ch1=='1'){
                    one--;
                }
                sb.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return sb1.toString();
    }
}