package OOPS.Inheritance.Hierarchical;

public class Main {
    public static void main(String[] args) {
        Developer developer =  new Developer("Abc", 123, 29, "Java");
        Tester tester = new Tester("Def", 234, 30, "Postman");
        Manager manager = new Manager("Ghi", 345, 31, "IT");
        developer.display();
        tester.display();
        manager.display();
    }
}
