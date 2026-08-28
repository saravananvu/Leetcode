class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length(),m = t.length();
        int i , j = 0;
        while(i < n && j < m){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }  
        }
        return m - j;
    }
}
