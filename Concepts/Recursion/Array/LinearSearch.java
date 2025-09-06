package Recursion.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int i = arr[0];
        System.out.println(search2(arr,target,i));
    }

    static boolean search(int[] arr, int target, int i) {
        if(i == arr.length) return false;
        if(arr[i] == target) return true;
        return search(arr,target,i+1);
    }

    static boolean search2(int[] arr, int target, int i) {
        if(i == arr.length) return false;
        return arr[i] == target || search2(arr,target,i+1);
    }
}
