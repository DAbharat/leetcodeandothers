package LinkedList.CircularLL;

public class Main {
    static void main() {
        circular list = new circular();

        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.display();

        list.delete(2);

        list.display();
    }
}

// Output:
// 1->2->3->HEAD
// 1->3->HEAD