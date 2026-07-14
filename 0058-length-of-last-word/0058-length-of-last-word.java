class Solution {
    public int lengthOfLastWord(String s) {
        String words[]=s.trim().split(" ");
        int n=words.length;
        String a=words[n-1];
        return a.length();
    }
}