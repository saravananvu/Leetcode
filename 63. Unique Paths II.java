// we are making the dp as 1 once the path is found(the path is fully made as 1 so we cant repeatedly calculating cell)
class Solution {
    final int[][] diff = { { 0, 1 }, { 1, 0 } };

    public int uniquePathsWithObstacles(int[][] obstacle) {
        int x = obstacle.length;
        int y = obstacle[0].length;
        int dp [][] = new int [x][y];
        for(int i = 0; i < x; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return dfs(0,0,x,y,obstacle,dp);
    }

    public  int dfs(int row,int col,int x,int y,int[][] obstacle,int dp [][]){
        if( obstacle[row][col] != 0){
            return 0;
        }
        if(row == x - 1 && col == y - 1){
            return 1;
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        int count = 0;
        for(int i = 0;i < 2;i++){
        int ar = row + diff[i][0];
        int ac = col + diff[i][1];
        if(ar >=0 && ar < x && ac >= 0 && ac < y){
            count += dfs(ar,ac,x,y,obstacle,dp);
           }
        }
        dp[row][col] = count;
        return count;
    }
}
