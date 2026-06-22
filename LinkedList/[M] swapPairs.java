class Solution {
    //(1->2->3->4) 
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = first.next;
        ListNode prev = null; //to connect previous pair to current swapped pair
        
        head = second;
        while(second != null && first != null) {
            if(prev != null) prev.next = second;

            first.next = second.next; 
            second.next = first;
            prev = first;
            
            first = first.next;
            if(first != null)second = first.next;
        } 
        
        //for 1st swap (2 → 1 → 3 → 4)
        // for 2nd swap (2 → 1  4 → 3)

        //if(prev != null) prev.next = second; --> connects 1 to 4. so, (2 → 1 → 4 → 3)
        return head;
    }
}