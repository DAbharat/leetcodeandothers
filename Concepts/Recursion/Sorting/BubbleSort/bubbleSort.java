package Recursion.Sorting.BubbleSort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int last, int i) {
        if(last == 0) return;
        if(i < last) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            sort(arr, last,i+1);
        } else {
            sort(arr,last-1,0);
        }
    }
}
