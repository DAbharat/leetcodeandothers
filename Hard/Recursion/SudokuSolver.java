class Solution {
    public boolean solveSudoku(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //check for empty cell, if there is, store its row and col index
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft) break;
        }
        if(emptyLeft) return true; //sudoku is solved


        //checks every number from 1 to 9 by placing it in the empty cell
        for (char number = '1'; number <= '9'; number++) {
            if(isSafe(board, row, col, number)) {
                board[row][col] = number; //place the number but it can lead to wrong soln
                if(solveSudoku(board)) {
                    return true;
                } else {
                    board[row][col] = '.'; //if lead to wrong soln, backtrack
                }
            }
        }
        return false;
    }

    boolean isSafe(char[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) { //safe for row?
            if(board[row][i] == num) {
                return false;
            }
        }
        for(char[] nums: board) { //safe for column?
            if(nums[col] == num) {
                return false;
            }
        }

        //safe for the particular box?
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}

//pass the sudoku board in the argument and check for isSafe function accordingly
//isSafe checks for all the conditions we ned to fulfill to complete the sudoku (rows, columns and each box)
