class Solution {
    public int climbStairs(int n) {
        if(n<=1)return 1;
        int dp[]=new int[n+1];
        dp[n]=climbStairs(n-1)+climbStairs(n-2);
        return dp[n];
    }
}