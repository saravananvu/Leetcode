class Solution {
    public boolean winnerSquareGame(int n) {
        boolean [] dp = new boolean[n + 1];
        // n + 1 bec dp[0] == false and we can play game only from 1 to n(array);
        for(int i = 1;i <= n;i++){
            for(int j = 1; (j * j) <= i;j++){
                if(!dp[i - (j * j)]){
                    dp[i] = true;
                    break; // break because test for n = 4;
                }
            }
        }
        return dp[n];
    }
}
