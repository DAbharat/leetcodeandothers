package binarySearch;

import java.util.Arrays;

public class searchInMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 23, 35},
                {2, 27, 39},
                {3, 28, 42}
        };
        System.out.println(Arrays.toString(sortedMatrix(nums,39)));
    }

    static int[] sortedMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row<matrix.length && col>0) {
            if(matrix[row][col]==target) {
                return new int[]{row,col};
            }
            if(matrix[row][col]<target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
