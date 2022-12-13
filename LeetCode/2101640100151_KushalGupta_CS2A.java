/**
 * leetcode.com/problems/intersection-of-two-linked-lists/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int sizeA = 0;
        int sizeB = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            sizeA++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            sizeB++;
        }
        if(sizeA > sizeB){
            while(sizeA != sizeB){
                headA = headA.next;
                sizeA--;
            }
        } else {
            while(sizeA != sizeB){
                headB = headB.next;
                sizeB--;
            }
        }
        while(headA != null){
            if(headA == headB)
                return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
