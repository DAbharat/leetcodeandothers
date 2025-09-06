package Recursion.Array;

public class rotatedBinSearch {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2,3,4,5};
        System.out.println(rotate(arr,1,0,arr.length-1));
    }

    static int rotate(int[] arr, int target, int start, int end) {
        if(start>end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        if(arr[start] <= arr[mid]) {
            if(target >= arr[start] && target<=arr[mid]){
                return rotate(arr,target,start,mid-1);
            }
            else {
                return rotate(arr,target,mid+1,end);
            }
        }
        if (target <= arr[end] && target >= arr[mid]) {
            return rotate(arr, target, mid + 1, end);
        }
        return rotate(arr, target, start, mid - 1);
    }
}
