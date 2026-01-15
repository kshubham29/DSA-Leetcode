class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // base case
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        return (p.val == q.val)
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
