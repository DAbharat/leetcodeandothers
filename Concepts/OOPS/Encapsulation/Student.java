package OOPS.Encapsulation;

public class Student {
    private int marks;

    void setMarks(int marks) {
        if(marks>=0 && marks<=75) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    //can access private fields via getters
    int getMarks() {
        return marks;
    }
}
