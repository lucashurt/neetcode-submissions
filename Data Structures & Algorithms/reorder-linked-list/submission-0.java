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
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!= null && fast.next != null){
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

        while(second != null){
            ListNode temp = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp;
            first = temp;
            second = temp2;
        }

        ListNode print = slow;
        while (print != null) {
            System.out.println(print.val);
            print = print.next;
        }

    }
}
