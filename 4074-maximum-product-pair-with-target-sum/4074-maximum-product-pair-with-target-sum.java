class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int n=nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int pro=0;
        int a[]={-1,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && nums[i]+nums[j]==target && nums[i]>nums[j]){
                    int p=nums[i]*nums[j];
                    if(maxProduct<p){
                        maxProduct=p;
                        a[0]=i;
                        a[1]=j;
                    }
                }
            }
        }
        return a;   
    }
}