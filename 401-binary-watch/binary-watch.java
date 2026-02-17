class Solution {
    List<String> l;

    public void rec(int n, int[] hr, int[] min, int h, int m, boolean[] hb, boolean[] mb) {
        if (h > 11 || m > 59) {
            return;//negative base case
        }
        if (n == 0) {
            String time = h + ":" + (m <= 9 ? "0" + m : m);
            if(!l.contains(time))
            l.add(time);
            return;
        }
        for (int i = 0; i < 6; i++) {
            if (!mb[i]) {
                mb[i] = true;
                rec(n - 1, hr, min, h, m + min[i], hb, mb);
                mb[i] = false;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (!hb[i]) {
                hb[i] = true;
                rec(n - 1, hr, min, h + hr[i], m, hb, mb);
                hb[i] = false;
            }
        }
    }

    public List<String> readBinaryWatch(int turnedOn) {
        l = new ArrayList<>();
        int[] hr = { 1, 2, 4, 8 };
        boolean[] hb = new boolean[4];
        int[] min = { 1, 2, 4, 8, 16,32 };
        boolean[] mb = new boolean[6];
        rec(turnedOn, hr, min, 0, 0, hb, mb);
        return l;
    }
}