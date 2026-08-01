class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while(j<n){
            if (nums[j] == 0) {
                count++;
            }
            while(count>1){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            max=Math.max(max,j-i);
            j++;
        }
        return max;
    }
}