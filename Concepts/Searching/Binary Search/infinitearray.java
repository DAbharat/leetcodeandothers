package binarySearch;

public class infiniteArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,9,12,15,18,19,24,29,35,39};
        int target = 9;
        System.out.println(ans(nums,target));
    }

    static int ans(int[]arr, int target) {
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int newStart = end+1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start, int end) {


        while (start <= end) {
            int middleElem = (start + end) / 2;
            if (start > end) {
                return -1;
            } else if (target < arr[middleElem]) {
                end = middleElem - 1;
            } else if (target > arr[middleElem]) {
                start = middleElem + 1;
            }
            else {
                return middleElem;
            }
        }
        return -1;
    }
}
