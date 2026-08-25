class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                l.add(nums[i]);
            }
        }
        int max=-1;
        for(int i=0;i<n;i++){
            int a=nums[i]*-1;
            if(l.contains(a)){
                max=Math.max(max,a*-1);
            }
        }
        return max;
    }
}