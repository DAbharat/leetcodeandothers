package Recursion;

public class Noofzeroes {
    public static void main(String[] args) {
        System.out.println(zero(20050000));
    }

    static int zero(int n) {
        return count(n,0);
    }

    static int count(int n, int count) {
        if(n==0) return count;
        if (n%10 == 0) return count(n/10, count+1);
        return count(n/10, count);
    }
}
