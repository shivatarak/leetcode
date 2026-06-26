class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=bills.length;
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i=0;i<a;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five>0){
                    five-=1;
                    ten++;
                }
                else{
                return false;
                }
            }
            else{
                if(five>0 && ten>0){
                    ten-=1;
                    five-=1;
                    twenty++;
                }
                else if(five>=3){
                    five-=3;
                    twenty++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}