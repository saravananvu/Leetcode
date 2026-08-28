class Solution {
    public int[] replaceElements(int[] arr) {
        int [] res = new int[arr.length];
        int rightmax = -1;
        for(int i = n - 1;i >= 0;i--){
            res[i] = rightmax;
            rightmax = Math.max(rightmax,arr[i]);
        }
        return res;
    }
}
