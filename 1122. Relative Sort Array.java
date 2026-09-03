class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] res = new int[arr1.length];
        int [] num = new int[1001];
        for(int i : arr1){
            num[i]++;
        }
        int k = 0;
        for(int i : arr2){
           for(int j = 0;j < num[i];j++){
            res[k] = i;
            k++;
           }
           num[i] = 0;
        }
        for(int i = 0;i < 1001;i++){
            while(num[i] > 0){
                res[k++] = i;
                num[i]--;
            }
        }
        return res;
    }
}
