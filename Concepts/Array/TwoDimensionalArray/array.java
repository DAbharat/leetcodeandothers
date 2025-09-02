package Array.TwoDimensionalArray;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        for (int rows = 0; rows < arr.length; rows++) {
            for (int column = 0; column < arr[rows].length; column++) {
                System.out.print(arr[rows][column] + " ");
            }
            System.out.println();
        }
        //or
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        //or
        // for (int[] row : arr) {
        //     System.out.println(Arrays.toString(row));
        // }
    }
}
