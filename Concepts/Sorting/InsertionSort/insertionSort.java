package Sorting.insertionSort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,7,6,8,5,4};
        insSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
