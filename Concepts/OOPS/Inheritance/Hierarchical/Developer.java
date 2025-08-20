package OOPS.Inheritance.Hierarchical;

public class Developer extends Employee{
    String programmingLanguage;

    Developer(String name, int id, int age, String programmingLanguage) {
        super(name, id, age);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
