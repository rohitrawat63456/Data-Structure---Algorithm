class Solution {
    List<String> l;

    public void rec(int n, int h, int m, int idx) {
        if (h > 11 || m > 59) {
            return;//negative base case
        }
        if (n == 0) {
            String time = h + ":" + (m <= 9 ? "0" + m : m);
            l.add(time);
            return;
        }
        int[] t = { 1, 2, 4, 8, 1, 2, 4, 8, 16, 32 };
        for (int i = idx; i < 10; i++) {
            if (i < 4) {
                rec(n - 1, h + t[i], m, i + 1);
            } else {
                rec(n - 1, h, m + t[i], i + 1);
            }

        }
    }

    public List<String> readBinaryWatch(int turnedOn) {
        l = new ArrayList<>();
        // boolean[] hb = new boolean[4];
        // boolean[] mb = new boolean[6];
        rec(turnedOn, 0, 0,0);
        return l;
    }
}