class Solution {
    public int majorityElement(int[] nums) {
        int f = 0;
        int val = 0;
        for (int n : nums) {
            if (f == 0) {
                val = n;
                f = 1;
                continue;
            }
            if (val == n) {
                f++;//increase freq
            } else {
                f--;//cancel out non equal elements
            }
        }
        return val;
    }
}