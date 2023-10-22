class Solution {
    private long[] dp;
    int MOD = (int)Math.pow(10 , 9) + 7;
    public long solve(int n){
        if(n==0) return 1;
        if(n<3) return n;

        if(dp[n]!=-1) return dp[n];

        return dp[n] = 2*solve(n-1)%MOD+solve(n-3)%MOD;
    }
    public int numTilings(int n) {
        this.dp = new long[n+1];
        Arrays.fill(dp , -1);

        return (int)solve(n)%MOD;
    }
}
