/**
 * Leetcode 142. Linked List Cycle II
 * Given a linked list, return the node where the cycle begins. 
 * If there is no cycle, return null.
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> seen = new ArrayList<>();
        
        for (; head != null; head = head.next) {
            if (seen.contains(head)) {
                return head;
            }
            
            seen.add(head);
        }
        
        return null;
    }
}