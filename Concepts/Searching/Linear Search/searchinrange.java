package linearsearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] num = {0,4,-5,2,2,9,-7,3};
        int target = 0;
        System.out.println(linearSearch(num,target,1,5));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length==0) {
            return -1;
        }

        for(int i=start; i<end; i++) {
            int element = arr[i];
            if (element == target) {
                return arr[i];
            }
        }
        return -1;
    }
}
