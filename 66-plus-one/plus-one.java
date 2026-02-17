class Solution {
    public int[] plusOne(int[] digits) {
        int c = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum;
            if (i == digits.length - 1) {
                sum = digits[i] + c + 1;
            } else {
                sum = digits[i] + c;
            }
            if (sum > 9) {
                list.add(sum % 10);
                c = 1;
            } else {
                list.add(sum);
                c = 0;
            }
        }
        if (c != 0) {
            list.add(c);
        }
        int len = list.size();
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[len - i - 1] = list.get(i);
        }
        return arr;

    }
}