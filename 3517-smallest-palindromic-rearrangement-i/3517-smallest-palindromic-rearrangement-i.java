class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n<2){
            return s;
        }
        String h1=s.substring(0,n/2);
        char[] ch=h1.toCharArray();
        Arrays.sort(ch);
        String st=new String(ch);
        String middle = (n % 2 != 0) ? String.valueOf(s.charAt(n / 2)) : "";
        String reversedHalf = new StringBuilder(st).reverse().toString();
        return st + middle + reversedHalf;
    }
}