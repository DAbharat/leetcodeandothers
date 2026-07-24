/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode nextNode = null;
        ListNode prevNode = null;
        while(curr!=null) {
            ListNode end = findEnd(curr,k);
            if(end==null) {
                if(prevNode!=null) prevNode.next=curr;
                break;
            }
            nextNode=end.next;
            end.next=null;
            reverse(curr);
            if(curr==head) {
                head=end;
            } else {
                prevNode.next=end;
            }
            prevNode=curr;
            curr=nextNode;
        }
        return head;
    }

    ListNode findEnd(ListNode temp, int k) {
        for(int i=0; i<k-1; i++) {
            if(temp==null || temp.next==null) return null;
            temp=temp.next;
        }
        return temp;
    }

    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = curr.next;
        while(curr != null) {
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null) next=next.next;
        }
        head=prev;
        return prev;
    }
}