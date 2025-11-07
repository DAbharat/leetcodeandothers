class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;

        //reach to left
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 0; i<left-1; i++) {
            prev = curr;
            curr = curr.next;
        }

        //keep traversing and reversal with prev, curr and next while keeping track of first and elem
        ListNode first = prev;
        ListNode elem = curr;
        ListNode next = curr.next;
        for(int i = 0; i<right-left+1; i++) { //reversal of ll
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next=next.next;
            }
        }

        // now 1<-2<-3<-4->5
        // first = 1
        // elem = 2
        // prev = 4
        // curr = 5
        
        // connect them all
        if(first != null) {
            first.next = prev;
        } else {
            head = prev;
        }
        elem.next=curr; 
        //1->4->3->2->5
        return head;
    }
}