class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                while(nums[i]>=nums[i+1]){
                    c++;
                    nums[i+1]=nums[i+1]+1;
                }
            }
        }
        return c;
    }
}