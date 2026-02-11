class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        int idx = 0, i = 0, j = 0;
        while (i < m && j < n) {
            int a = arr[i];
            int b = nums2[j];
            if (a <= b) {
                i++;
            } else {
                j++;
            }
            nums1[idx++] = Math.min(a, b);
        }
        while (i < m) {
            nums1[idx++] = arr[i++];
        }
        while (j < n) {
            nums1[idx++] = nums2[j++];
        }
    }
}