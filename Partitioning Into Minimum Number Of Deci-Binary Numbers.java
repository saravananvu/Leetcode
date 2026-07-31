class Solution {
    public int minPartitions(String n) {
        for(int i = 9;i >= 1;i--){
            if(n.indexOf(i + '0') != -1){
                return i;
            }
        }
        return -1;
    }
}
