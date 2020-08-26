/**
 * 1265. Print Immutable Linked List in Reverse
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */
import java.util.*; 
class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> nodes = new Stack<>();
        while (head != null) {
            nodes.add(head);
            head = head.getNext();
        }
        
        while (!nodes.isEmpty()) {
            ImmutableListNode i = nodes.pop();
            i.printValue();
        }
    }
}