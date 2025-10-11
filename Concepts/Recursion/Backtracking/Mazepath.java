package Recursion.Backtracking;

public class MazePath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        path("", maze, 0,0);
    }

    static void path(String fh, boolean[][] maze, int row, int column) {
        if(row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(fh);
            return;
        }

        if(!maze[row][column]) return;

        maze[row][column] = false;

        if(row < maze.length - 1) {
            path(fh+'D', maze, row + 1, column);
        }

        if(column < maze[0].length - 1) {
            path(fh+'R', maze, row, column + 1);
        }

        if(column > 0) {
            path(fh+'L', maze, row, column - 1);
        }

        if(row > 0) {
            path(fh+'U', maze, row - 1, column);
        }

        maze[row][column] = true;
    }
}
