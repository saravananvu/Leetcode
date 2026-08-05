class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        Map <Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0;i < n;i++){
            Map <Integer,Integer> newmap = new HashMap<>();
            for(int val : map.keySet()){
                int x = val + nums[i];
                int y = val - nums[i];
                newmap.put(x, newmap.getOrDefault(x,0) + map.get(val));
                newmap.put(y, newmap.getOrDefault(y,0) + map.get(val));
            }
            map = newmap;
        }
        int count = 0;
        for(int i : map.keySet()){
            if(i == target){
                count += map.get(i);
            }
        }
        return count;
    }
}
