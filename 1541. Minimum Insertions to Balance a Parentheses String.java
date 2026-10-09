class Solution {
    public int minInsertions(String s) {
        // Stack <Character> stack = new Stack<>();
        // int cnt = 0;
        // for(char c : s.toCharArray()){
            
        //     if(c == '('){
        //         stack.push(c);
        //     }else{
        //         if(cnt == 2 && stack.size() != 0 && stack.peek() != ''){
        //             stack.pop();
        //             stack.pop();
        //             stack.pop();
        //             cnt = 0;
        //         }
        //         stack.push(c);
        //         cnt++;
        //     }
        // }
        // return 3 - stack.size();
        int need = 0;
        int ans = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(need % 2 == 1){
                    ans ++;
                    need --;
                }
                need += 2;
            }else{
                need--;
                if(need == -1){
                    ans ++;
                    need = 1;
                }
            }
        }
        return ans + need;
    }
}
