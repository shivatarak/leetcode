class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int write=0;
        while(i<n){
            char ch=chars[i];
            int count=0;
            while(i<n && ch==chars[i]){
                i++;
                count++;
            }
            chars[write]=ch;
            write++;
            if(count>1){
                String str=String.valueOf(count);
                for(char c:str.toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
}