package OOPS.Polymorphism.MethodOverriding;

public class Rectangle extends Shapes{
    @Override
    void area() {
        System.out.println("Area of Rectangle is: length * breadth");
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle is: 2 * length + breadth");
    }
}
