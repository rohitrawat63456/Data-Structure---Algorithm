class Solution {
    public int countBinarySubstrings(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        int f1 = 0;
        char p = arr[0];
        int i = 0;
        while (i < arr.length && arr[i] == p) {
            i++;
            f1++;
        }
        while (i < arr.length) {
            char x = arr[i];
            int f2 = 0;
            while (i<arr.length && arr[i] == x) {
                f2++;
                i++;
            }
            count += Math.min(f2, f1);
            f1 = f2;
        }
        return count;
    }
}