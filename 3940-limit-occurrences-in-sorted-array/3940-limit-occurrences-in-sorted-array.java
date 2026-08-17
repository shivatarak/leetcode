class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        int count=1;
        l.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=k){
                l.add(nums[i]);
            }
        }
        int a[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            a[i]=l.get(i);
        }
        return a;
    }
}