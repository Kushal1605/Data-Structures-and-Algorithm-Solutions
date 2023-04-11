/*
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode node = swapPairs(head.next.next);
        head.next.next = head;
        ListNode tempNode = head.next;
        head.next = node;
        return tempNode;
    }   
}
