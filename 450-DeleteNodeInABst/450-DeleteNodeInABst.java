// Last updated: 7/14/2026, 2:01:05 PM
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
    public int minValue(TreeNode root) {
        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.val; 
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.val = minValue(root.right);
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
}