class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        solve(nums,0);
        return ans;
    }
    public void solve(int[] nums, int start){
        if(start==nums.length){
            List<Integer>temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        Set<Integer>set=new HashSet<>();
        for(int i=start;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            swap(nums,start,i);
            solve(nums,start+1);
            swap(nums,start,i);

        }
    }
    public void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}