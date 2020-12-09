/**
 * Leetcode 445. Add Two Numbers II
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The most significant digit comes first and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        
        ListNode curr = l1;
        ListNode head = null;
        int carry = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while (curr != null) {
            s1.add(curr.val);
            curr = curr.next;
        }
        curr = l2;
        while (curr != null) {
            s2.add(curr.val);
            curr = curr.next;
        }
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int x = !s1.isEmpty() ? s1.pop() : 0;
            int y = !s2.isEmpty() ? s2.pop() : 0;
            int total = x + y + carry;
            int res = total % 10;
            carry = total / 10;
            curr = new ListNode(res);
            curr.next = head;
            head = curr;
        }
        
        if (carry > 0) {
            curr = new ListNode(carry);
            curr.next = head;
            head = curr;
        }
        
        return head;
        
    }
}