/* Leetcode 817. Linked List Components
 * We are given head, the head node of a linked list containing unique integer values.
 * We are also given the list G, a subset of the values in the linked list.
 * Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.
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
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> values = new HashSet<>();
        int comps = 0;
        
        for (int g : G) {
            values.add(g);
        }
        
        while (head != null) {
            if (values.contains(head.val) && (head.next == null || !values.contains(head.next.val))) {
                comps++;
            }
            head = head.next;
        }
        
        return comps;
    }
}