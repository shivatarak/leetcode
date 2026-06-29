class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        //int k=0;
        ArrayList<Integer>l=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}