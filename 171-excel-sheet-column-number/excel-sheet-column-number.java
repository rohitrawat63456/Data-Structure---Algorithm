class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        int pow = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int p = (int) Math.pow(26, pow++);
            columnNumber += p*(columnTitle.charAt(i) - 'A' + 1);
        }
        return columnNumber;
    }
}