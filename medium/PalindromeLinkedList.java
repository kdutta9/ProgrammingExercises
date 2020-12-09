/** 
 * Leetcode 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> reverse = new Stack<>();
        int cmp; 
        ListNode curr = head;
        
        while (curr != null) {
            reverse.add(curr.val);
            curr = curr.next;
        }
        
        while (!reverse.isEmpty()) {
            cmp = reverse.pop();
            if (head.val != cmp) {
                return false;
            }
            head = head.next;
        }
        
        return true;
    }
}