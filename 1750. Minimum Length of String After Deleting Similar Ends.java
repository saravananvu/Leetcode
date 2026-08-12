class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(left);
            while(left <= right && c == s.charAt(left)){
                left++;
            }
            while(left <= right && c == s.charAt(right)){ 
            //left <= right because 3 - 3 = 0 but it calculates the answer 0+1 so we give that to handle 3 - 4 + 1 = 0  
            // left = 4
            // right = 3
            // 3 - 4 + 1 = 0
                right--;
            }
        }
        return right - left + 1;
    }
}
