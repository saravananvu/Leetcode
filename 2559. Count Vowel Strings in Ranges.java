class Solution {
    public boolean isvowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] res = new int[queries.length];
        int [] prefix = new int[words.length];
        int vwlcnt = 0;
        if(isvowel(words[0].charAt(0)) && isvowel(words[0].charAt(words[0].length() - 1))) vwlcnt++;
        prefix[0] = vwlcnt;
        for(int i = 1;i < words.length;i++){
            String s = words[i];
            int count = 0;
            if(isvowel(s.charAt(0)) && isvowel(s.charAt(s.length() - 1))) count++;
            prefix[i] = prefix[i - 1] + count;
        }
        for(int i = 0;i < queries.length;i++){
            int lq = queries[i][0];
            int rq = queries[i][1];
            if(lq != 0) res[i] = prefix[rq] - prefix[lq - 1];
            else res[i] = prefix[rq];
        }
        return res;
    }
}
