package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,63,74,85,97,98,566,766,879,6578};
        int target = 5;
        System.out.println(binarysearch(nums,target,0,nums.length-1));
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid]>target) {
            return binarysearch(arr,target,start,mid-1);
        }
        return binarysearch(arr,target,mid+1,end);
    }
}
