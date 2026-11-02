class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int k=0;
        if(n%2==0){
            k=nums[n/2 -1]; 
            
        }
        else{
            k=nums[n/2];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.abs(k-nums[i]);
        }
        return sum;
    }
}