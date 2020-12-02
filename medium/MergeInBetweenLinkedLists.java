/**
 * Leetcode 1669. Merge In Between Linked Lists
 * You are given two linked lists: list1 and list2 of sizes n and m respectively.
 * Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode tail = list1;
        ListNode mid = list2;
        
        for (int i = 0; i < b + 1; i++) {
            if (i < a - 1) {
                head = head.next;
            }
            tail = tail.next;
        }
        while (mid.next != null) {
            mid = mid.next;
        } 
        head.next = list2;
        mid.next = tail;
        
        return list1;
    }
}