package linearsearch;

public class minNumber {
    public static void main(String[] args) {
        int[] num = {2,3,12,-6,47};
        System.out.println(min(num));
    }

    static int min(int[] arr) {
        if(arr.length==0) {
            return -1;
        }
        int element = arr[0];
        for(int i=1; i<arr.length; i++) {

            if(arr[i]<element) {
                element = arr[i];
                return element;
            }
        }
        return -1;
    }
}
