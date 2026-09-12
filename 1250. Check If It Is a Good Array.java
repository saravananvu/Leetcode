class Solution {
    public boolean isGoodArray(int[] nums) {
        int n = 0;
        for (int i : nums) {
            n = gcd(n, i);
        }
        if (n == 1)
            return true;
        return false;
    }

    public static int gcd(int x, int y) {
        if (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
            return gcd(x, y);
        }
        return x;
    }
}
