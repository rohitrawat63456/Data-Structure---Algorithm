class Solution {
    public boolean isPowerOfTwo(int n) {
        while (n != 1) {
            if (n % 2 != 0 || n == 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}