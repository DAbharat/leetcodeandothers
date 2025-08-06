package Sorting.cyclicSort;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] nums = {2,5,4,1,3};
        cSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void cSort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
