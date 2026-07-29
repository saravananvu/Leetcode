class Solution {
    private int gci(int row,int col,int C){
        return row * C + col + 1;
    }
    private int find(int leader [],int node){
        if(leader[node] != node){
            leader[node] = find(leader,leader[node]);
        }
        return leader[node];
    }
    private void join(int leader [],int left,int right){
        leader[find(leader,right)] = find(leader,left);
    }
    public int latestDayToCross(int R, int C, int[][] cells) {
        int leader [] = new int[R*C+2];
        boolean water [] = new boolean[R*C + 2];
        for(int i = 0;i < R*C + 2;i++){
            leader[i] = i;
        }
        int days = 0;
        int diff [][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int [] cell:cells){
            int row = cell[0],col=cell[1];
            row--; col--;
            water[gci(row,col,C)] = true;
            for(int i = 0;i < 8;i++){
                int ar = row  + diff[i][0];
                int ac = col + diff[i][1];
                if(ar>=0 && ar<R && ac>=0 && ac<C){
                    if(water[gci(ar,ac,C)]){
                        join(leader,gci(row,col,C),gci(ar,ac,C));
                    }
                }
            }
            if(col==0){
                join(leader,0,gci(row,col,C));
            }
            else if(col==C-1){
                join(leader,gci(row,col,C),R*C+1);
            }
            if(find(leader,0)==find(leader,R*C+1)){
                break;
            }
            days++;

        }
        return days;

    }
}
