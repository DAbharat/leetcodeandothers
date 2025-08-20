package OOPS.Inheritance.Multilevel;

public class ChildA extends Parent{
    String favsport;

    ChildA(String name, int age, int height, String favsport) {
        super(name, age, height);
        this.favsport = favsport;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Favorite Sport: " + favsport);
    }
}
