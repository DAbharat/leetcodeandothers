package OOPS.Inheritance.Hierarchical;

public class Tester extends Employee{
    String testingTool;

    Tester(String name, int id, int age, String testingTool) {
        super(name, id, age);
        this.testingTool = testingTool;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Testing Tool: " + testingTool);
    }
}
