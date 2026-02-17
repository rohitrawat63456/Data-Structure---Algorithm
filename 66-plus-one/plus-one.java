class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len - 1;
        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        int arr[] = new int[i < 0 ? len + 1 : len];
        if (i < 0) {
            arr[0] = 1;
        } else {
            digits[i] += 1;
        }
        for (int j = 0; j < len; j++) {
            if (i < 0) {
                arr[j + 1] = digits[j];
            } else {
                arr[j] = digits[j];
            }
        }
        return arr;
    }
}