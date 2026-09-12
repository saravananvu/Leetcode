class Solution {
    static final int [][] diff = {{0,1},{1,0}};
    public int uniquePaths(int m, int n) {
        int [][] dp = new int [m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return dfs(0,0,m,n,dp);
    }
    public static int dfs(int row,int col,int m,int n,int [][] dp){
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        if(row == m -1 && col == n - 1){
            return 1;
        }
        int count = 0;
        for(int i = 0;i < 2;i++)
        {
            int ar = row + diff[i][0];
            int ac = col + diff[i][1];
            if(ar >= 0 && ar < m && ac >= 0 && ac < n){
                count += dfs(ar,ac,m,n,dp);
            }
        }
        dp[row][col] = count;
        return count;
    }
}
