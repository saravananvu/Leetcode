class Solution {
    public int totalNumbers(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 0) continue;
            for(int j = 0;j < nums.length;j++){
                if(i == j) continue;
                for(int k = 0;k < nums.length;k++){
                    if(i == k || j == k || nums[k] % 2 != 0) continue;
                    int number =(nums[i] * 100) + (nums[j] * 10) + (nums[k]);
                    if((number & 1) == 0) set.add(number);
                }
            }
        }
        return set.size();
    }
}
