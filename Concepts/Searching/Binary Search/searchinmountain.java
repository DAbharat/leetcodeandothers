package binarySearch;

public class searchInMountain {
    public static void main(String[] args) {

    }

    static int peakIndexInMountainArray(int[]arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end) {
            int mid = (start + end)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return binarySearch(arr,target,peak+1,arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while(start<=end) {
            int middleElem = (end + start) / 2;

            if(arr[middleElem] == target) {
                return middleElem;
            }

            if (isAsc) {
                if (target < arr[middleElem]) {
                    end = middleElem - 1;
                } else {
                    start = middleElem + 1;
                }
            }
            else {
                if (target > arr[middleElem]) {
                    end = middleElem - 1;
                } else {
                    start = middleElem + 1;
                }
            }
        }
        return -1;
    }
}
