class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Stack<int[]> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 'X' && grid[i][j] == '1') {
                    count += 1;
                    stack.push(new int[] { i, j });
                    while (!stack.isEmpty()) {
                        int[] arr = stack.pop();
                        int r = arr[0];
                        int c = arr[1];
                        if (grid[r][c] == 'X')
                            continue;
                        grid[r][c] = 'X';
                        if (r > 0 && grid[r - 1][c] == '1')
                            stack.push(new int[] { r - 1, c });
                        if (c > 0 && grid[r][c - 1] == '1')
                            stack.push(new int[] { r, c - 1 });
                        if (r < row - 1 && grid[r + 1][c] == '1')
                            stack.push(new int[] { r + 1, c });
                        if (c < col - 1 && grid[r][c + 1] == '1')
                            stack.push(new int[] { r, c + 1 });
                    }
                }
            }
        }
        return count;
    }
}