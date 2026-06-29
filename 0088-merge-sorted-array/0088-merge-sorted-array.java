class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        ArrayList<Integer>l=new ArrayList<>();
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                l.add(nums1[i]);
                i++;
            }
            else{
                l.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            l.add(nums1[i]);
            i++;
        }
        while(j<n){
            l.add(nums2[j]);
            j++;
        }
        for(int k=0;k<l.size();k++){
            nums1[k]=l.get(k);
        }
    }
}