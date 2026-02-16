class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        int len = sb.length();
        int d = 32 - len;
        while (d > 0) {
            sb.append("0");
            d--;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}