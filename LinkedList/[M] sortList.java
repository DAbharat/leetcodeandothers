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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid = findMid(head);
        ListNode start = head;
        ListNode end = mid.next;
        mid.next = null;
        start=sortList(start);
        end=sortList(end);
        return mergeTwoSortedLists(start,end);
    }

    ListNode findMid(ListNode head) {
        ListNode first = head.next;
        ListNode second = head;
        while(first!=null && first.next!=null) {
            first=first.next.next;
            second=second.next;
        }
        return second;
    }

    ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode temp = node;
        while(l1!=null && l2!=null) {
            if(l1.val<l2.val) {
                temp.next=l1;
                l1=l1.next;
            } else {
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null) {
            temp.next=l1;;
        } else {
            temp.next=l2;
        }
        return node.next;
    }
}