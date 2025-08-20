package OOPS.Inheritance.Hierarchical;

public class Manager extends Employee{
    String department;

    Manager(String name, int id, int age, String department) {
        super(name, id, age);
        this.department = department;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
