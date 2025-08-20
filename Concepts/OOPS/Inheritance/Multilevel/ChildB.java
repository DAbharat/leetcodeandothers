package OOPS.Inheritance.Multilevel;

public class ChildB extends ChildA{
    String favPlayer;

    ChildB(String name, int age, int height, String favsport, String favPlayer) {
        super(name, age, height, favsport, favPlayer);
        this.favPlayer = favPlayer;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Favorite Player: " + favPlayer);
    }
}
