class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int num = x;
        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return (x % sum) == 0 ? sum : -1;
    }
}
