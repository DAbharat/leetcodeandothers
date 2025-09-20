package Recursion.Sorting.MergeSort;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,7,6};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end) {
        if(end - start == 1) return;

        int mid = start + (end - start) / 2;

        sort(arr,start,mid);
        sort(arr,mid,end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] join = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i<mid && j<end) {
            if(arr[i] < arr[j]) {
                join[k] = arr[i];
                i++;
            } else {
                join[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid) {
            join[k] = arr[i];
            i++;
            k++;
        }

        while(j<end) {
            join[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < join.length; l++) {
            arr[start + l] = join[l];
        }
    }
}
