package Maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 13;
            if(isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }

    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        for(int i=2; i*i<n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
