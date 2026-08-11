class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder();
        sb.append(goal);
        sb.append(goal);
        String str = sb.toString();
        if(str.contains(s)){
            return true;
        }
        return false;
    }
}
