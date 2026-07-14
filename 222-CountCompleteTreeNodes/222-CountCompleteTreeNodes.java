// Last updated: 7/14/2026, 2:01:36 PM
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = getLeftDepth(root);
        int rightDepth = getRightDepth(root);
        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1; 
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int getLeftDepth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = node.left;
        }
        return depth;
    }

    private int getRightDepth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = node.right;
        }
        return depth;
        
    }
}
