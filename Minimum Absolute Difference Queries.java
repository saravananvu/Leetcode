class Solution {
    public int[] minDifference(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        int arr [] = new int[q];
        int [][] prefix = new int[n+1][101];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 101;j++){
                prefix[i+1][j] = prefix[i][j];
            }
            prefix[i+1][nums[i]]++;
        }
        for(int i = 0;i < q;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            List<Integer> ls = new ArrayList<>();
            for(int j = 0;j < 101;j++){
                if(prefix[right + 1][j] - prefix[left][j] > 0){ // we no need to subtract left -1 because it is 0 indexed ;
                    ls.add(j);
                }
            }
            int min = Integer.MAX_VALUE;
            if(ls.size() < 2){
                arr[i] = -1;
                continue;
            }
            for(int k = 1; k < ls.size();k++){
               min =  Math.min(min , ls.get(k) - ls.get(k - 1));
            }
           arr[i] = min;
           
        }    
        return arr;
    }
}
