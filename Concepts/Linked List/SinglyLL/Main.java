package LinkedList.SinglyLL;

public class Main {
    static void main() {
        singly list = new singly();
        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);

        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(6);

        list.insertAtIndex(1000, 3);

        list.display();

        System.out.println();
        System.out.println(list.deleteAtFirst());
        System.out.println(list.deleteAtLast());
        System.out.println(list.deleteAtInd(3));

        list.display();
    }
}

// Output:
// 3->2->1->1000->4->5->6->Null
// 3
// 6
// 1000
// 2->1->4->5->Null