package Array.OneDimensionalArray;

public class array {
    public static void main(String[] args) {
        String[] name = {"Abc", "Def", "Ghi", "Jkl", "Mno", "Pqr"};
        int[] marks = {90, 86, 82, 94, 90, 89};

        System.out.println("Marks of Students: ");
        for (int i = 0; i < name.length; i++) {
                System.out.println(name[i] + ": " + marks[i]);
        }

        int max = marks[0];
        for (int i=0; i<marks.length; i++) {
            if(marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Highest Marks: " + max);
    }
}
