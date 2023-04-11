/*
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode newHead = lists[0];
        for(int i = 1; i < lists.length; i++)
            newHead = mergeTwoLists(newHead, lists[i]);
        return newHead;
    }
    private ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        ListNode curr1 = head1, curr2 = head2;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode prev = dummy;
        prev.next = head1;
        while(curr1 != null && curr2 != null) {
            if(curr1.val >= curr2.val) {
                ListNode temp = curr2.next;
                curr2.next = curr1;
                prev.next = curr2;
                curr2 = temp;
                prev = prev.next;
            } else {
                curr1 = curr1.next;
                prev = prev.next;
            }
        }
        if(curr2 != null) {
            prev.next = curr2;
        }
        return dummy.next;
    }
}
