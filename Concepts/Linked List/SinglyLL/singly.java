package LinkedList.SinglyLL;

public class singly {
    private Node head;
    private Node tail;

    private int size;

    singly() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) tail=head;

        size++;
    }

    public void insertAtLast(int val) {
        if(tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int val, int ind) {
        if(ind == 0) {
            insertAtFirst(val);
            return;
        }

        if(ind == size) {
            insertAtLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < ind; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteAtFirst() {
        int val = head.val;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return val;
    }

    public int deleteAtLast() {
        if(size <= 1) {
            return deleteAtFirst();
        }

        Node secondLast = getInd(size - 1);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteAtInd(int ind) {
        if(ind == 0) {
            return deleteAtFirst();
        }
        if(ind == size - 1) {
            return deleteAtLast();
        }

        Node previous = getInd(ind - 1);
        int val = previous.next.val;
        previous.next = previous.next.next;
        return val;
    }

    public Node getVal(int val) {
        Node node = head;
        while(node != null) {
            if(node.val == val) return node;
            node = node.next;
        }
        return null;
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
        System.out.print("Null");
    }

}
