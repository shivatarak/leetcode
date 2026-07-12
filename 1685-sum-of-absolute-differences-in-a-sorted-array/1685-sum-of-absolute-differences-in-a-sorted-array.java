class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int total=0;
        int left=0;
        for(int a:nums){
            total+=a;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int valleft=(nums[i]*i)-left;
            int valrig=(total-left-nums[i])- (nums[i])*(n-i-1);
            a[i]=valrig+valleft;
            left+=nums[i];
        }
        return a;
    }
}