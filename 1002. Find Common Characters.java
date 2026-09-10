class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ls = new ArrayList<>();
        int [] freq = new int[26];
        String word = words[0];
        for(char c : word.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i = 1;i < words.length;i++){
            int [] temp = new int[26];
            String s = words[i];

            for(char c : s.toCharArray()){
                temp[c - 'a']++; // c - 'a' returns 0 based index from 0 to 25;
            }

            for(int j = 0;j < 26;j++){
                freq[j] = Math.min(freq[j], temp[j]);
            }
        }

        for(int i = 0;i < 26;i++){
            while(freq[i] > 0){
                ls.add((char) (i + 'a') + "");
                freq[i] --;
            }
        }
        return ls;
    }
}
