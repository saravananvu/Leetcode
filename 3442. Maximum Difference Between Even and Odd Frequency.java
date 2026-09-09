class Solution {
    public int maxDifference(String s) {
        Map <Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
           map.put(c,map.getOrDefault( c, 0) + 1);
        }
        int maxodd = Integer.MIN_VALUE , mineven = Integer.MAX_VALUE;
        for(int i : map.values()){
            if((i % 2) == 0){
                mineven = Math.min(mineven,i);
            }else{
                maxodd = Math.max(maxodd,i);
            }
        }
        return maxodd - mineven;
    }
}
