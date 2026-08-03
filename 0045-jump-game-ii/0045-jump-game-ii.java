class Solution {
    public int jump(int[] nums) {
        int dest=nums.length-1;
        int count=0;
        int cov=0;
        int last=0;
        for(int i=0;i<nums.length-1;i++){
            cov=Math.max(cov,i+nums[i]);
            if(i==last){
                last=cov;
                count++;
                if(cov>=dest){
                    return count;
                }
            }
        }
        return count;
    }
}