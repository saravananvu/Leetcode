class Solution {
    public int longestSubsequence(int[] nums) {
        int bitwise = 0;
        for(int i : nums){
            bitwise ^= i;
        }

        if(bitwise != 0) return nums.length;

        for(int i : nums){
            if(i != 0) return nums.length - 1;
        } // any number we remove it will be the result of the XOR

        return 0;
    }
}
