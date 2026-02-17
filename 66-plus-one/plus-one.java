class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0; // carry
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum;
            if (i == digits.length - 1) {
                sum = digits[i] + c + 1;
            } else {
                sum = digits[i] + c;
            }
            list.add(sum % 10);
            c = sum > 9 ? 1 : 0;
        }
        if (c != 0) {
            list.add(c);
        }
        int[] arr = new int[list.size()];
        int len = list.size();
        for (int i = len - 1; i >= 0; i--) {
            arr[len - i - 1] = list.get(i);
        }
        return arr;
    }
}