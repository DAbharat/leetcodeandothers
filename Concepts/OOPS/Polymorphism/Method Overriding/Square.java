package OOPS.Polymorphism.MethodOverriding;

public class Square extends Shapes{
    @Override
    void area() {
        System.out.println("Area of Square is: side * side");
    }

    void perimeter() {
        System.out.println("Perimeter of Square is: 4 * side");
    }
}
