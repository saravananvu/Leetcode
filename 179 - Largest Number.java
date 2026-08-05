class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String [] arr = new String[n];
        int idx = 0;
        for(int i : nums){
            arr[idx++] = String.valueOf(i);
        }
        String  res = "";
        Arrays.sort(arr, (a , b) -> (b + a) . compareTo(a + b)); // b + a in first because if we put a + b first it sorts in ascending order but we need in descending order.
        for(String i : arr){
            res += i;
        }
        if(res.charAt(0) == '0') return "0";
        return res;
    }
}
