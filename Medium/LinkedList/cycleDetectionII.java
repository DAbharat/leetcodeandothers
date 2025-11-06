public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fastptr = head;
        ListNode slowptr = head;

        while(fastptr!=null && fastptr.next!=null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr) {
                length = length(slowptr);
                break;
            }
        }
        if(length == 0) {
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        //moving second ptr length times every time till condn fails
        while(length > 0) {
            second = second.next;
            length--;
        }
        //to meet at the start node of cycle
        while(first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public int length(ListNode head) {
        ListNode fastptr = head;
        ListNode slowptr =  head;

        while(fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr) {
                ListNode temp = slowptr;
                int length = 0;
                //to run the loop atleast once
                do {
                    temp = temp.next;
                    length++;
                } while(temp != slowptr); return length;
            }
        } return 0;
    }
}