/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lcaHelper(root, p, q);
    }

    private TreeNode lcaHelper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lcaHelper(root.left, p, q);
        TreeNode right = lcaHelper(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else {
            return left != null ? left : right; 
        }
    }
}