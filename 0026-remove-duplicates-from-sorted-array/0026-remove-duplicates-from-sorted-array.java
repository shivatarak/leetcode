class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}