/**
 * Leetcode 700. Search In A Binary Search Tree
 * Given the root node of a binary search tree (BST) and a value.  
 * You need to find the node in the BST that the node's value equals the given value. 
 * Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;
        
        while (curr != null) {
            if (curr.val == val) {
                break;
            } else if (curr.val < val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        
        return curr;
        
    }
}