class Solution {
    public int minimumDeletions(String s) {
        int len = s.length();
        int[][] dp = new int[len+1][3];
        for (int idx = len-1; idx >= 0; idx--) {
            char ch = s.charAt(idx);
            for (int prev = 0; prev <= 2; prev++) {
                int notTake = 1 + dp[idx+1][prev];

                int take = Integer.MAX_VALUE;
                if(prev == 0){
                    take = dp[idx+1][ch=='a'?1:2];
                }else{
                    char p = prev==1 ? 'a':'b';
                    if(!(p=='b' && ch=='a')){
                        take = dp[idx+1][ch=='a'?1:2];
                    }
                }
                dp[idx][prev] = Math.min(take,notTake);
            }
        }
        return dp[0][0];
    }
}
