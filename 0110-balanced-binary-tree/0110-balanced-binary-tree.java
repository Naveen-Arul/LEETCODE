class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    // This function returns height if balanced
    // Returns -1 if NOT balanced
    private int checkHeight(TreeNode node) {
        // Base case: empty tree
        if (node == null) {
            return 0;
        }
        // Check left subtree height
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1; // left subtree not balanced
        }
        // Check right subtree height
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1; // right subtree not balanced
        }
        // Check balance condition
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // current node not balanced
        }
        // Return height of current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
