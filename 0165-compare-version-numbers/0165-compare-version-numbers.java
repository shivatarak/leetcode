class Solution {
    public int compareVersion(String version1, String version2) {
        String[] words1=version1.split("\\.");
        String[] words2=version2.split("\\.");
        int n=Math.max(words1.length,words2.length);
        for(int i=0;i<n;i++){
            int word1=0;
            int word2=0;
            if(i<words1.length){
                word1=Integer.parseInt(words1[i]);
            }
            if(i<words2.length){
                word2=Integer.parseInt(words2[i]);
            }
            if(word1>word2){
                return 1;
            }
            if(word1<word2){
                return -1;
            }
        }
        return 0;
    }
}