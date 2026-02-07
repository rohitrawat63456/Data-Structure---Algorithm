class Solution {
    public int rec(String s, int prev, int[][] dp, int idx) {
        if (idx == s.length()) {
            //System.out.println(prev);
            return 0;
        }
        if (dp[idx][prev] != -1) {
            return dp[idx][prev];
        }

        char ch = s.charAt(idx);
        int take = Integer.MAX_VALUE;
        int notTake = Integer.MAX_VALUE;
        if (prev == 0) {
            take = rec(s, ch == 'a' ? 1 : 2, dp, idx + 1);
        } else {
            char p = prev == 1 ? 'a' : 'b';
            if (p == ch || (ch == 'b' && p == 'a')) {
                take = rec(s, ch == 'a' ? 1 : 2, dp, idx + 1);
            }
        }
        notTake = rec(s, prev, dp, idx + 1) + 1;//not take
        return dp[idx][prev] = Math.min(take, notTake);

    }

    public int minimumDeletions(String s) {
        int len = s.length();
        int[][] dp = new int[len][3];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        // Arrays.fill(dp, -1);
        return rec(s, 0, dp, 0);
    }
}
