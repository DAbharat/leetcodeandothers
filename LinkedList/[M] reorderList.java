class Solution {
    public void reorderList(ListNode head) {
        if(head == null) return;
        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        ListNode start = head;
        ListNode end = rev;

        while(head.next != null && rev.next != null) {
            start = head.next;
            head.next = rev;
            head = start;
            end = rev.next;
            rev.next = head;
            rev = end;
        }
        
    }
    ListNode reverse(ListNode head) {
        if(head == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next  = curr.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) next = next.next;
        }
        head = prev;
        return prev;
    }

    ListNode middle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(first != null && first.next != null) {
            first = first.next.next;
            second = second.next;
        }
        return second;
    }
}