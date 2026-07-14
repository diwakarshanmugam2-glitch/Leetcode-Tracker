// Last updated: 7/14/2026, 2:02:01 PM
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; // Empty tree has depth 0
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
