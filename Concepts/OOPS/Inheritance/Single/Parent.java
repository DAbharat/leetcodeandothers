package Concepts.OOPS.Inheritance.Single;

public class Parent {
    String name;
    String course;
    int semester;

    Parent(String name, String course, int semester) {
        this.name = name;
        this.course = course;
        this.semester = semester;

    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}
