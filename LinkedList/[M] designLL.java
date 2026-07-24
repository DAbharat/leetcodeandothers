class MyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    class Node {
        Node next;
        Node prev;
        int val;
        public Node(int val) {
            this.val = val;
        }
    }
    public MyLinkedList() {
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node curr = head;
        for(int i=0; i<index; i++) {
            if(i!=index && curr != null) {
                curr=curr.next;
            }
        }
        if(curr==null) return -1;
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head==null) {
            head=node;
            tail=node;
            node.prev=null;
            node.next=null;
        } else {
            node.next=head;
            head.prev=node;
            node.prev=null;
            head=node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail==null) {
            tail=node;
            head=node;
            node.next=null;
            node.prev=null;
        } else {
            tail.next=node;
            node.prev=tail;
            node.next=null;
            tail=node;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        Node curr = head;
        Node node = new Node(val);
        for(int i=0; i<index; i++) {
            if(i!=index) curr=curr.next;
        }
        if(index==size) {
            addAtTail(val);
        } else if(index==0) {
           addAtHead(val);
        } else { 
            node.next=curr;
            node.prev=curr.prev;
            curr.prev.next=node;
            curr.prev=node;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        Node curr = head;
        for(int i=0; i<index; i++) {
            if(i!=index) curr=curr.next;
        }
        if(curr==head && curr==tail) {
            head=null;
            tail=null;
        } else if(curr==head) {
            curr.next.prev=null;
            head=curr.next;
        } else if(curr==tail) {
            curr.prev.next=null;
            tail=curr.prev;
        } else {
            curr.prev.next=curr.next;
            curr.next.prev=curr.prev;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */