class Solution {
    public String smallestSubsequence(String s) {
        int n=s.length();
        int last[]=new int[26];
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
        }
        boolean seen[]=new boolean[26];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(seen[idx]==true){
                continue;
            }
            while(sb.length()>0 && sb.charAt(sb.length()-1)>ch && last[sb.charAt(sb.length()-1)-'a']>i){
                seen[sb.charAt(sb.length()-1)-'a']=false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(ch);
            seen[idx]=true;
        }
        return sb.toString();
    }
}