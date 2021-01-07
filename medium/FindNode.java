/* Leetcode 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * Given two binary trees original and cloned and given a reference to a node target in the original tree.
 * The cloned tree is a copy of the original tree.
 * Return a reference to the same node in the cloned tree.
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        ArrayList<Integer> visited = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(cloned);
        int res = target.val;
        
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.println(curr.val);
            
            if (visited.contains(curr.val)) {
                continue;
            }
            visited.add(curr.val);
            
            if (curr.val == res) {
                return curr;
            } else {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        
        return null;
    }
}