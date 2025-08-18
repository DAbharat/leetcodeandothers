package binarySearch;

public class intro {
    public static void main(String[] args) {
        int[] num = {1,2,4,6,7,51,68,500,4560};
        int target = 68;
        System.out.println(binarySearch(num, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middleElem = (start + end)/2;
            if(start>end) {
                return -1;
            }
             else if (target<arr[middleElem]) {
                end = middleElem-1;
            }
            else if (target>arr[middleElem]) {
                start = middleElem+1;
            }
            else {
                return middleElem;
            }
        }
        return -1;
    }
}
