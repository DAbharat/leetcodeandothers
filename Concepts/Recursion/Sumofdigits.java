package Recursion;

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println(sum(10245));
    }

    static int sum(int n) {
        if(n==0) return 0;
        return sum(n/10) + n%10;
    }
}
