package OOPS.Inheritance.Hierarchical;

public class Employee {
    String name;
    int id;
    int age;

    Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: "+ age);
    }
}
