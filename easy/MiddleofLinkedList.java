/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        int nodeLength = 0;
        ListNode end = head;
        while (end.next != null) {
            end = end.next;
            nodeLength++;
        }
        
        int half = (int) Math.ceil((double) nodeLength / 2);
        for (int i = 0; i < half; i++) {
            head = head.next;
        }
        
        return head;
    }
}