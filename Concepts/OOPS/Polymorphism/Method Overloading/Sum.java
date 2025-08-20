package OOPS.Polymorphism.MethodOverloading;

public class Sum {
    public static void main(String[] args) {
        System.out.println(add(2,3));
    }

    static int add(int a, int b, int c) {
        return a+b+c;
    }

    static int add(int a, int b) {
        return a+b;
    }
}
