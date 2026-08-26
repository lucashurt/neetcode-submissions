class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        int res = 0;
        if(n<=2) return n;

        for(int i=n-1;i>=0;i--){
            if(i == n-1 || i == n-2) dp[i] = 1;
            else{
                dp[i] = dp[i+1] + dp[i+2];
            }
        }
        return dp[0] + dp[1];
    }
}
