package Recursion.Sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,7,6};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[]second) {
        int[] join = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<first.length && j<second.length) {
            if(first[i] < second[j]) {
                join[k] = first[i];
                i++;
            } else {
                join[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length) {
            join[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length) {
            join[k] = second[j];
            j++;
            k++;
        }
        return join;
    }
}
