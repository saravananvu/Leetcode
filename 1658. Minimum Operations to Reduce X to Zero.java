class Solution {
    public int minOperations(int[] nums, int x) {
        int total_sum = 0;
        for(int i : nums) total_sum += i;
        int target = total_sum - x;// we are going to get maximunSubArraysum which is equal to target when we get we can simply subract the length from total length to get the ans   [1,1,4,3,2] = 1+1+4 =6 balance remaining 3+2 = 5 this is the minimum length;

        int l = 0;
        int max_subarray = -1;
        int sum = 0;
        for(int r = 0;r < nums.length;r++){
            sum += nums[r];
            if(sum > target){
                while(r >= l && sum > target){
                sum -= nums[l];
                l++;
                }
            }
            if(sum == target){
                max_subarray = Math.max(max_subarray,(r - l + 1));
            }
        }
        return max_subarray == -1 ? -1 : nums.length - max_subarray;      
    }
}
