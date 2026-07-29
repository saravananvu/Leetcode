class Solution {
    public void join(int [] leader,int lt,int rt){
        int leftleader = findleader(leader,lt);
        int rightleader = findleader(leader,rt);
        leader[leftleader] = rightleader;
    }
    public int findleader(int [] leader,int i){
        if(leader[i] != i){
            leader[i] = findleader(leader,leader[i]);
        }
        return leader[i];
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int [] leader = new  int [n + 1];
        for(int i = 1; i <= n;i++) {
            leader[i] = i;
        }
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n;j++){
                if(i == j) continue;
                if(isConnected[i][j] == 1){
                    join(leader,i + 1,j + 1);
                }
            }
        }
        Set <Integer> st = new HashSet<>();
        for(int i = 1;i <= n;i++){
            st.add(findleader(leader,i));
        }
        return st.size();
    }
}
