class Solution {
    public boolean isPathCrossing(String path) {
        int n=path.length();
        int x = 0;
        int y = 0;
        Set<String>set=new HashSet<>();
        set.add("0,0");
        for(int i=0;i<n;i++){
            char ch=path.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }
            String pos =(x + "," + y);
            if(set.contains(pos)){
                return true;
            }
            set.add(pos);
        }
        return false;
    }
}