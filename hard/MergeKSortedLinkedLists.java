/**
 * Leetcode 23. Merge k Sorted Lists
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode merged = new ListNode();
        ListNode head = merged;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((l1, l2) -> l1.val - l2.val);
        
        for (ListNode ln: lists) {
            if (ln != null) {
                pq.add(ln);
            }
        }
        
        
        while (!pq.isEmpty()) {
            ListNode curr = pq.poll();
            merged.next = curr;
            if (curr.next != null) {
                pq.add(curr.next);
            }
            merged = merged.next;
        }
        
        return head.next;
    }
}