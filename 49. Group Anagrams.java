class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String word = new String(c); // converting a char array to String.
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
