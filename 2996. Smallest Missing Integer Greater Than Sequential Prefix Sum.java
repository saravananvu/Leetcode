class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        boolean [] iscontainsnum = new boolean[1276];
        for(int i = 0; i < n;i++){
            iscontainsnum[nums[i]] = true;
        }
        int sum = nums[0];
        for(int i = 1;i < n;i++){
            if(nums[i] == (nums[i - 1] + 1 )){
                sum += nums[i];
            }else{
                break;
            }
        }
        while(iscontainsnum[sum]){
            sum ++;
        }

        return sum;
    }
}
