class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int imax=0;
        int imin=0;
        for(int i=0;i<n;i++){
            if(min>nums[i]){
                imin=i;
                min=nums[i];
            }
            if(max<nums[i]){
                imax=i;
                max=nums[i];
            }
        }
        int k=Math.min(imax,imin);
        int l=Math.max(imax,imin);
        int m=Math.min((n-l)+(k+1),l+1);
        m=Math.min(m,(n-k));
        return m;
    }
}