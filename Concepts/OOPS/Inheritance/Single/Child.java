package Concepts.OOPS.Inheritance.Single;

public class Child extends Parent{
    float GPA;
    Child(String name, String course, int semester, float GPA) {
        super(name, course, semester);
        this.GPA = GPA;
    }

    void display() {
        super.display();
        System.out.println("GPA: " + GPA);
    }
}
