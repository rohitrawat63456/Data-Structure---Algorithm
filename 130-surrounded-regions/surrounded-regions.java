class Solution {
    public void solve(char[][] board) {
        Stack<int[]> stack = new Stack<>();
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i == 0 || i == row - 1 || j == 0 || j == col - 1) && board[i][j] == 'O') {
                    stack.push(new int[] { i, j });
                    while (!stack.isEmpty()) {
                        int[] arr = stack.pop();
                        int r = arr[0];
                        int c = arr[1];
                        if (board[r][c] == '1')
                            continue;
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
                    }
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