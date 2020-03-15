/**
 * Description: Given a binary tree, return the sum of values of its deepest leaves.
 * Constraints: The number of nodes in the tree is between 1 and 10^4.
 *              The value of nodes is between 1 and 100.
 * Leetcode 1302 (explanation: https://www.youtube.com/watch?v=hM9tzzlRcnM)
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DeepestLeavesSum {
    public static void main(String... args) {
        int result = deepestLeavesSum(args);
        System.out.println(result);
    }

    public static int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> nodeQ = new LinkedList();
        nodeQ.offer(root);

        int levelSum = 0;

        while (!nodeQ.isEmpty()) {
            levelSum = 0;
            int size = nodeQ.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = nodeQ.poll();
                levelSum += curr.val;

                if (curr.left != null) {
                    nodeQ.offer(curr.left);
                }
                if (curr.right != null) {
                    nodeQ.offer(curr.right);
                }
            }
        }

        return levelSum;
    }
}