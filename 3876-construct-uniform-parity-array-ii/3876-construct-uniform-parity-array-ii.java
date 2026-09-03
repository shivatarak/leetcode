class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                min=Math.min(min,nums1[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0 && nums1[i]<min && min!=Integer.MAX_VALUE){
                return false;
            }
        }
        return true;
    }
}