class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                zero++;
                i++;
            }
            else if(nums[i]==1){
                one++;
                i++;
            }
            else{
                two++;
                i++;
            }
        }
        int j=0;
        while(zero-->0){
            nums[j]=0;
            j++;
        }
        while(one-->0){
            nums[j]=1;
            j++;
        }
        while(two-->0){
            nums[j]=2;
            j++;
        }
    }
}