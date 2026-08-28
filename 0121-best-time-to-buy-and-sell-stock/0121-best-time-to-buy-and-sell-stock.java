class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[]=new int[n];
        int min=prices[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            int profit=prices[i]-min;
            dp[i]=Math.max(dp[i-1],profit);
        }
        return dp[n-1];
    }
}