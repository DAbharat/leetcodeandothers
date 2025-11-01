package LinkedList.DoublyLL;

public class Main {
    static void main() {
        Doubly list = new Doubly();

        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.insertAtFirst(4);

        list.insertAtLast(1);

        list.insertAfterInd(1,5);

        list.display();
        System.out.println();
        list.displayReverse();
    }
}

// Output:
// 4->5->3->2->1->NULL
// REVERSE
// 1->2->3->5->4->START