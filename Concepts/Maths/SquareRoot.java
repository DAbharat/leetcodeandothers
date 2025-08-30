package Maths;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 27;
        int decVal = 3;
        System.out.printf("%.3f",  root(n, decVal));
    }

    static double root(int n, int decVal) {
        int start = 0;
        int end = n;
        double root = 0;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if(mid*mid==n) {
                return mid;
            }
            else if (mid*mid>n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double incr = 0.01;
        for (int i = 0; i < decVal; i++) {
            while(root*root<=n) {
                root = root + incr;
            }
            root = root - incr;
            incr = incr/10;
        }

        return root;
    }
}
