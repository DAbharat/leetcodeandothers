package OOPS.Polymorphism.MethodOverriding;

public class Circle extends Shapes{
    @Override
    void area() {
        System.out.println("Area of Circle is: 3.14 * radius * radius");
    }

    void circumference() {
        System.out.println("Circumference of Circle is: 2 * 3.14 * radius");
    }
}
