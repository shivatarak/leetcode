class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int k=sum/3;
        sum=0;
        int c=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                sum=0;
                c++;
            } 
        }
        return c>=3;
    }
}