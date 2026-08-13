class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int start=0;
        int sum=0;
        for(int i=0;i<n;i++){
            start=Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++){
                sum+=nums[j];
            }
        }
        return sum;
    }
}