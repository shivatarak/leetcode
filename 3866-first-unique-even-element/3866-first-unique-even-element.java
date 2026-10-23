class Solution {
    public int firstUniqueEven(int[] nums) {
        //List<Integer>a=new ArrayList<>();
        int n=nums.length;
        //int c=0;
        int b[]=new int[101];
        for(int i=0;i<n;i++){
            b[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && b[nums[i]]==1){
                return nums[i];
            }
        }
        return -1;
    }
}