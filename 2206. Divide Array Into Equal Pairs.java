class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        for(int i : map.keySet()){ //i is only the value of key 
            if(map.get(i) % 2 == 1){ //map.get(i) retrives the frequency (ie,value);
                return false;
            }
        }
        return true;
    }
}
