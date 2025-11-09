class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;

        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        while(rev != null) {
            if(head.val != rev.val) break;
            head = head.next;
            rev = rev.next;
        }
        reverse(rev);
        if(head == null || rev == null) return true;
        return false;
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

    ListNode reverse(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
        return prev;
    }
}