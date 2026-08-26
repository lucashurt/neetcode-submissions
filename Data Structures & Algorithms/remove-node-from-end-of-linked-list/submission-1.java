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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = reverseList(head);
        ListNode dummy = new ListNode(0);
        dummy.next = curr;
        ListNode prev = dummy;


        for(int i=1;i<=n;i++){
            if(i!=n){
                prev = curr;
                curr = curr.next;
            }
            else{
                prev.next = curr.next;
            }
        }
        return(reverseList(dummy.next));

    }

    public ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while(curr!=null){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
}
