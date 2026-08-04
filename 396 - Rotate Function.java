class Solution {
    public int maxRotateFunction(int[] nums) {
       int n = nums.length;

       if( n == 1) return 0;

       long fn = 0;
       
       long sum = 0;
       for(int i = 0; i < n; i++){
        sum += nums[i];
        fn += (i * nums[i]);
       }

       long maxval = fn;
       for ( int i = n - 1; i >= 0;i--){
        fn += sum - n * nums[i];
        maxval =  Math.max(maxval,fn);
       }

       return (int)maxval;

    }
}



//approach 2

// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         int N=nums.length,sum=0;
//         long fnval=0,maxfnv=0;
//         for(int i=0;i<N;i++){
//             sum+=nums[i];
//             fnval+=(i*nums[i]);
//         }
//         maxfnv=fnval;
//         for(int lasti=N-1;lasti>0;lasti--){
//             fnval=fnval-(nums[lasti]*(N-1))+(sum-nums[lasti]);
//             maxfnv=Math.max(maxfnv,fnval);
//         }
//         return (int)maxfnv;

//     }
// }
