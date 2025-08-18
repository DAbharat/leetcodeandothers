package linearsearch;

public class evenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {123,356,32,477};
        System.out.println(linearSearch(nums));
    }

    static int linearSearch(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = checkEven(num);
        return numberOfDigits % 2 == 0;
    }

    static int checkEven(int num) {
        int count = 0;

        while(num>0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
