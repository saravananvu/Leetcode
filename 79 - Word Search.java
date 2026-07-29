class Solution {
    int [][] digg = {{-1,0},{1,0},{0,1},{0,-1}};
    public boolean dfs(char[][] board, String word,int row,int col,int i,int j,int idx){
        char temp = board[i][j];
        board[i][j] = '-';
        if (idx == word.length())
            return true;

        for(int k = 0;k < 4;k++){
            int ar = i + digg[k][0];
            int ac = j + digg[k][1];
            if(ar < row && ar >= 0 && ac < col && ac >=0 && board[ar][ac] == word.charAt(idx)){
                if(dfs(board,word,row,col,ar,ac,idx+1)){
                   return true; 
                }
            }

        }
        board[i][j] = temp;
        return false;
        
    }
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int idx = 0;
        boolean ans = false;
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                if(board[i][j] == word.charAt(idx)){
    
                    if(dfs(board,word,row,col,i,j,idx + 1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
