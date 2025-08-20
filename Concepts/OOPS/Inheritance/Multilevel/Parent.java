package OOPS.Inheritance.Multilevel;

public class Parent {
    String name;
    int age;
    int height;

    Parent(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
