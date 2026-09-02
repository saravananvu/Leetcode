class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avg = 0;
        int waitingtime = customers[0][0];
        for(int i = 0;i < customers.length;i++){
            int et = customers[i][0];
            int ot = customers[i][1];
            waitingtime = Math.max(et,waitingtime) + ot;
            avg += waitingtime - et;
        }
        return avg / customers.length;
    }
}
