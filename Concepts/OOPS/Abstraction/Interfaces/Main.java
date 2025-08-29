package OOPS.Abstraction.Interfaces;

public class Main {
    public static void main(String[] args) {
        Person student = new Person("Bharat", 20, "Computer Science", "Football");
        student.introduction();
        student.study();
        student.getCourse();
        student.play();
        student.getSport();
    }
}
