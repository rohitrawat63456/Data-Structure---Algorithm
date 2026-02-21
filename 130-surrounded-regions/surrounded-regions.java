class Solution {
    public void solve(char[][] board) {
        Stack<int[]> stack = new Stack<>();
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < col; i++) {
            if (board[0][i] == 'O' && !visited[0][i]) {
                stack.push(new int[] { 0, i });
                while (!stack.isEmpty()) {
                    int[] arr = stack.pop();
                    int r = arr[0];
                    int c = arr[1];
                    board[r][c] = '1';
                    if (r - 1 >= 0 && board[r - 1][c] == 'O') {
                        stack.push(new int[] { r - 1, c });
                    }
                    if (r + 1 < row && board[r + 1][c] == 'O') {
                        stack.push(new int[] { r + 1, c });
                    }
                    if (c - 1 >= 0 && board[r][c - 1] == 'O') {
                        stack.push(new int[] { r, c - 1 });
                    }
                    if (c + 1 < col && board[r][c + 1] == 'O') {
                        stack.push(new int[] { r, c + 1 });
                    }
                    visited[r][c] = true;
                }
            }
        }
        for (int i = 0; i < col; i++) {
            if (board[row - 1][i] == 'O' && !visited[row - 1][i]) {
                stack.push(new int[] { row - 1, i });
                while (!stack.isEmpty()) {
                    int[] arr = stack.pop();
                    int r = arr[0];
                    int c = arr[1];
                    board[r][c] = '1';
                    if (r - 1 >= 0 && board[r - 1][c] == 'O') {
                        stack.push(new int[] { r - 1, c });
                    }
                    if (r + 1 < row && board[r + 1][c] == 'O') {
                        stack.push(new int[] { r + 1, c });
                    }
                    if (c - 1 >= 0 && board[r][c - 1] == 'O') {
                        stack.push(new int[] { r, c - 1 });
                    }
                    if (c + 1 < col && board[r][c + 1] == 'O') {
                        stack.push(new int[] { r, c + 1 });
                    }
                    visited[r][c] = true;
                }
            }
        }
        for (int i = 1; i < row - 1; i++) {
            if (board[i][0] == 'O' && !visited[i][0]) {
                stack.push(new int[] { i, 0 });
                while (!stack.isEmpty()) {
                    int[] arr = stack.pop();
                    int r = arr[0];
                    int c = arr[1];
                    board[r][c] = '1';
                    if (r - 1 >= 0 && board[r - 1][c] == 'O') {
                        stack.push(new int[] { r - 1, c });
                    }
                    if (r + 1 < row && board[r + 1][c] == 'O') {
                        stack.push(new int[] { r + 1, c });
                    }
                    if (c - 1 >= 0 && board[r][c - 1] == 'O') {
                        stack.push(new int[] { r, c - 1 });
                    }
                    if (c + 1 < col && board[r][c + 1] == 'O') {
                        stack.push(new int[] { r, c + 1 });
                    }
                    visited[r][c] = true;
                }
            }
        }
        for (int i = 1; i < row - 1; i++) {
            if (board[i][col - 1] == 'O' && !visited[i][col-1]) {
                stack.push(new int[] { i, col - 1 });
                while (!stack.isEmpty()) {
                    int[] arr = stack.pop();
                    int r = arr[0];
                    int c = arr[1];
                    board[r][c] = '1';
                    if (r - 1 >= 0 && board[r - 1][c] == 'O') {
                        stack.push(new int[] { r - 1, c });
                    }
                    if (r + 1 < row && board[r + 1][c] == 'O') {
                        stack.push(new int[] { r + 1, c });
                    }
                    if (c - 1 >= 0 && board[r][c - 1] == 'O') {
                        stack.push(new int[] { r, c - 1 });
                    }
                    if (c + 1 < col && board[r][c + 1] == 'O') {
                        stack.push(new int[] { r, c + 1 });
                    }
                    visited[r][c] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }
}