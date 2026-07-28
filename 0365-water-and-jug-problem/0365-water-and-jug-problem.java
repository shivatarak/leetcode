class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
     if(target>x+y){
        return false;
     }   
     if(target%gcd(x,y)==0){
        return true;
     }
     return false;   
    }
    public int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}