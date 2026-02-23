class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len <4) {
            int max = 0;
            for(int i:nums)
            max = Math.max(max,i);
            return max;
        }
        int[] dp = new int[len-1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);
        for (int i = 2; i < nums.length - 1; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        int[] dp2 = new int[nums.length-1];
        dp2[0] = nums[1];
        dp2[1] = Math.max(dp2[0],nums[2]);
        for(int i=3;i<len;i++){
            dp2[i-1]= Math.max(dp2[i-2],nums[i]+dp2[i-3]);
        }
        return Math.max(dp[len-2],dp2[len-2]);
    }
}