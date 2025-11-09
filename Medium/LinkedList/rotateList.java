class Solution {
    public ListNode rotateRight(ListNode head, int k) { //k=2
        if(k<=0 || head == null) return head;
        ListNode end = head;
        int len = 1;
        while(end.next!= null) {
            end = end.next;
            len++;
        }
        end.next = head; //loop formed (1->2->3->4->5->1)
        int rotations = k%len;
        int skip = len - rotations; //loop break & find new last node 
        ListNode last = head;
        for(int i = 0; i < skip-1; i++) {
            last = last.next; //after loop ends, new last node = 3
        }
        head = last.next; //(4->5->1->2->3->4)
        last.next = null; //(4->5->1->2->3->null)
        return head;
    }
}