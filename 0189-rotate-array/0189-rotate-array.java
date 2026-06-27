class Solution {
    public static void flip(int left,int right,int[] nums){
        while(left<=right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        flip(0,n-k-1,nums);
        flip(n-k,n-1,nums);
        flip(0,n-1,nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
}