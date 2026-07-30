class Solution {
    public int orangesRotting(int[][] grid) {
       int row = grid.length;
       int col = grid[0].length;
       int oranges = 0;
       
       int [][] digg = {{-1,0},{1,0},{0,1},{0,-1}};

       Queue <int []> queue = new LinkedList<>();

       for(int i = 0;i < row;i++)
       {
        for(int j = 0;j < col;j++)
        {
            if(grid[i][j] != 0) oranges++;

            if(grid[i][j] == 2){
                queue.add(new int [] {i,j});
                grid[i][j] = 0;
            }
        }
       }

       if(oranges == 0) return 0;

       int minutes = -1;
       while(!queue.isEmpty())
       {
            minutes++;
            int orangesize = queue.size();
            oranges -= orangesize;

       for(int i = 0;i < orangesize;i++)
       {
            int [] arr = queue.poll();
            for(int k = 0;k < 4;k++)
            {
            int ar = arr[0] + digg[k][0];
            int ac = arr[1] + digg[k][1];
            
            if(ar >=0 && ar < row && ac >=0 && ac < col && grid[ar][ac] == 1){
            queue.add(new int [] {ar,ac});
            grid[ar][ac] = 0;
              }
            }
         }
      }
    return oranges == 0 ? minutes:-1;
    }
}
