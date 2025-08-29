package OOPS.Abstraction.Interfaces;

public class Person implements Student, SportsPlayer{
    private String name;
    private int age;
    private String course;
    private String sport;

    Person(String name, int age, String course, String sport) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.sport = sport;
    }

    @Override
    public void play() {
        System.out.println("I play: " + sport);
    }

    @Override
    public String getSport() {
        return sport;
    }

    @Override
    public void study() {
        System.out.println("I am studying: " + course);
    }

    @Override
    public String getCourse() {
        return course;
    }

    void introduction() {
        System.out.println("I am " + name + ", " + "I am " + age + " years old");
    }
}
