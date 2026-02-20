class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    p += 4;
                    if (i + 1 < row) {
                        p = grid[i + 1][j] == 1 ? --p : p;
                    }
                    if (i - 1 >= 0) {
                        p = grid[i - 1][j] == 1 ? --p : p;
                    }
                    if (j + 1 < col) {
                        p = grid[i][j + 1] == 1 ? --p : p;
                    }
                    if (j - 1 >= 0) {
                        p = grid[i][j - 1] == 1 ? --p : p;
                    }
                }
            }
        }
        return p;
    }
}