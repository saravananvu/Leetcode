class Solution {
    int [][] digg = {{-1,0},{1,0},{0,-1},{0,1}};
    public int dfs(int [][] grid,int row,int col,int i,int j,boolean [][] isvisited){
        isvisited[i][j] = true;
        int count = 0;
        for(int k = 0;k < 4;k++){
        int ar = i + digg[k][0];
        int ac = j + digg[k][1];
        if(ar < row && ar >=0 && ac < col && ac >=0 && grid[ar][ac] == 1 && !isvisited[ar][ac]){
           count++;
           count += dfs(grid,row,col,ar,ac,isvisited);
        }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        boolean [][] isvisited = new boolean[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                int totalcount = 0;
                if(grid[i][j] == 1 && !isvisited[i][j]){
                    totalcount = 1 + dfs(grid,row,col,i,j,isvisited);
                }
                max = Math.max(max,totalcount);
            }
        }
        return max;
    }
}
