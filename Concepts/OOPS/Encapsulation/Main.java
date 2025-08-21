package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMarks(47);
        System.out.println(student.getMarks());
        System.out.println(student.marks); // Error - cannot access private fields directly
    }
}
