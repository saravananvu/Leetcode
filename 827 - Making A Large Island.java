class Solution {
    private int [][] diff = {{-1,0},{1,0},{0,-1},{0,1}};
    public  void dfs (int [][] grid,int row,int col,int i,int j,int island,boolean [][] isvisited){
        grid[i][j] = island;
        isvisited[i][j] = true;
        for(int k = 0; k < 4;k++){
            int ar = i + diff[k][0];
            int ac = j + diff[k][1];
            
            if(ar < row && ar >= 0 && ac < col && ac >=0 && grid[ar][ac] == 1  && !isvisited[ar][ac]){
                
                dfs(grid,row,col,ar,ac,island,isvisited);
            }
        }
    }
    public int largestIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int island = 0;
        boolean [][] isvisited = new boolean[row][col];
        for(int i = 0; i < row;i++){
            for(int j = 0;j < col;j++){
                if((grid[i][j] == 1) && !isvisited[i][j] ){
                    dfs(grid,row,col,i,j,++island,isvisited);
                }
            }
        }
        int [] cellcount = new int[island + 1]; // island + 1 because island starts from 1 to n
        for(int i = 0; i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                int land = grid[i][j];
                cellcount[land]++;
            }
        }
        int maxsize = 0;
        for(int i = 1;i <= island;i++){
            maxsize = Math.max(maxsize,cellcount[i]);
        }
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 0){
                    Set<Integer>st = new HashSet<>();
                    for(int k = 0;k < 4;k++){
                        int ar = i + diff[k][0];
                        int ac = j + diff[k][1];
                        if(ar >=0 && ar < row && ac >= 0 && ac < col && grid[ar][ac] != 0){
                            st.add(grid[ar][ac]);
                        }
                    }
                    int currentsize = 1;
                    for(int il : st){
                        currentsize += cellcount[il]; 
                    }
                    maxsize = Math.max(maxsize,currentsize);
                }
            }
        }
        return maxsize;
    }
}
