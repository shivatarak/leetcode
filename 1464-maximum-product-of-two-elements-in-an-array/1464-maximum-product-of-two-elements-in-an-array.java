class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int i=n-2;
        int j=n-1;
        int mul=0;
        Arrays.sort(nums);
        mul=(nums[i]-1)*(nums[j]-1);
        //i++;
        //    j--;
        return mul;
    }
}