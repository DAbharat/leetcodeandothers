package LinkedList.DoublyLL;

public class Doubly {
    private Node head;
    private Node tail;
    private int size;

    Doubly() {
        this.size = 0;
    }

    private class Node {
        int val;
        Node prev;
        Node next;

        Node(int val, Node prev, Node next) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val,null,null);
        if(head != null) head.prev = node;
        node.next = head;
        node.prev = null;
        head = node;

        if(tail == null) tail = node;

        size++;
    }

    public void insertAtLast(int val) {
//        if(tail == null) {
//            insertAtFirst(val);
//            return;
//        }

//        Node node = new Node(val,null,null);
//        tail.next = node;
//        node.prev = tail;
//        tail = node;
//        tail.next = null;

        //without using tail
        Node node = new Node(val,null,null);
        Node temp = head;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        tail = node;
    }

    public void insertAfterInd(int after, int val) {
        Node p = getInd(after);

        if(p == null) {
            System.out.println("p doesnt exist");
            return;
        }

        Node node = new Node(val, null, null);
        node.next = p.next;
        if(p.next != null) p.next.prev = node;
        p.next = node;
        node.prev = p;
    }

    public Node getInd(int ind) {
        Node node = head;
        for(int i = 1; i < ind; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public void displayReverse() {
        Node temp = tail;
        System.out.println("REVERSE");
        while(temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.prev;
        }
        System.out.print("START");
    }
}
