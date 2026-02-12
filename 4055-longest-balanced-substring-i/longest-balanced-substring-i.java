class Solution {
    public int longestBalanced(String s) {
        int len = s.length();
        int max = 1;
        int[] f;
        for (int i = 0; i < len; i++) {
            f = new int[26];
            f[s.charAt(i)- 'a'] += 1;
            for (int j = i + 1; j < len; j++) {
                f[s.charAt(j) - 'a'] += 1;
                if (isBalanced(f)) {
                    max = Math.max(j - i + 1, max);
                }
            }
        }
        return max;
    }

    public boolean isBalanced(int[] f) {
        int i = 0, j = 25;
        while (i < j) {
            if ((f[i] != 0 && f[j] != 0) && f[i] != f[j]) {
                return false;
            }
            if (f[i] == 0 && f[j] == 0) {
                i++;
                j--;
            } else if (f[i] == 0) {
                i++;
            } else {
                j--;
            }

        }
        return true;
    }
}