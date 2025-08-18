package linearsearch;

import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {-9,8},
                {5,-1,2,77}
        };
        int target = -1;
        int[] ans = linearSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearSearch(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for(int column=0; column<arr[row].length; column++) {
                if(arr[row][column] == target) {
                    return new int[] {row,column};
                }
            }
        }
        return new int[]{};
    }
}
