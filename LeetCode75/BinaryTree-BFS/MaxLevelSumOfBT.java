https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75
/**
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
  public int maxLevelSum(TreeNode root) {
    int max = Integer.MIN_VALUE, ans = 0;
    var queue = new ArrayDeque<TreeNode>();
    queue.offer(root);

    for (var level = 1; !queue.isEmpty(); level++) {
      var sum = 0;

      for (var i = queue.size(); i > 0; i--) {
        var node = queue.poll();

        sum += node.val;
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      if (sum > max) {
        max = sum;
        ans = level;
      }
    }
    return ans;
  }
}
