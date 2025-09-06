package Recursion.Array;

public class SortedorNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int i = arr[0];
        System.out.println(sorted2(arr, i));
    }

    static boolean sorted(int[] arr, int i) {
        if(i==arr.length-1) return true;
        if(arr[i]<arr[i+1]) {
            return sorted(arr, i + 1);
        }
        return false;
    }

    static boolean sorted2(int[] arr, int i) {
        if(i==arr.length-1) return true;
        return arr[i] < arr[i+1] && sorted(arr,i+1);
    }
}
