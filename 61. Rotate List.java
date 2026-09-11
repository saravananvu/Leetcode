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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k ==0) return head;
        int n = 1;
        ListNode tail = head;
        while(tail.next != null){
            n++;
            tail = tail.next;
        }
        k = k % n;
        if(k == 0) return head;
        tail.next = head;// making it circular
        //finding new tail
        int steps = n - k;
        ListNode ntail = head;
        for(int i = 1;i < steps;i++){
            ntail = ntail.next;
        }

        //finding new head
        ListNode nhead = head;
        nhead = ntail.next;

        //breaking the circular
        ntail.next = null;

        return nhead;
    }
}
