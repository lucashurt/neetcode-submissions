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
    public void reorderList(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow.next;
        ListNode prev = slow.next = null;

        while(current != null){
           ListNode temp = current.next; 
           current.next = prev;
           prev = current;
           current = temp;
        }

        ListNode first = head;
        ListNode second = prev;

        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }

        while(current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
