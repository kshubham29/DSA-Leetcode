class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // Both null → symmetric
        if (t1 == null && t2 == null) return true;

        // One null → not symmetric
        if (t1 == null || t2 == null) return false;

        // Values must match AND subtrees must be mirrors
        return (t1.val == t2.val)
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }
}
