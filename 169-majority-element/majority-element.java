class Solution {
    public int majorityElement(int[] nums) {
        int f = 0;
        int val=0;
        for (int i : nums) {
            if (f == 0) {
                f = 1;
                val = i;
                continue;
            }
            if (val == i) {
                f++;
            } else {
                f--;
            }
        }
        return val;
    }
}