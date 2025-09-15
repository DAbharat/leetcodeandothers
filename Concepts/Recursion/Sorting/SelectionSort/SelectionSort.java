package Recursion.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4};
        sort(arr,0,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int i, int minIndex) {
        if(start == arr.length - 1) return;
        if(i < arr.length) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            sort(arr, start, i+1, minIndex);
        } else {
            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;
        }
        sort(arr, start+1, start+1, start+1);
    }
}
