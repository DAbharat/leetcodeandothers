package OOPS.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        circle.area();
        square.area();
        rectangle.area();
        circle.circumference();
        square.perimeter();
        rectangle.perimeter();
    }
}
