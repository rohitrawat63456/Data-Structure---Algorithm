class Solution {
    public int longestBalanced(String s) {
        int len = s.length();
        int max = 1;
        int[] f;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            StringBuilder sb = new StringBuilder();
            f = new int[26];
            f[c - 'a'] += 1;
            sb.append(c);
            for (int j = i + 1; j < len; j++) {
                char ch = s.charAt(j);
                f[ch - 'a'] += 1;
                sb.append(ch);
                if (isBalanced(sb,f)) {
                    max = Math.max(sb.length(), max);
                }
            }
        }
        return max;
    }

    public boolean isBalanced(StringBuilder s,int[] f) {
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