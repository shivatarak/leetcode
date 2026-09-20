/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,left,mid-1);
        root.right=build(nums,mid+1,right);
        return root;
    }
    public TreeNode build(int[] nums,int i,int j){
        if(i>j){
            return null;
        }
        int mid=(i+j)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left = build(nums, i, mid - 1);
        root.right = build(nums, mid + 1, j);
        return root;
    }
}