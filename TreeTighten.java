public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if (t == null) return t;
        t.left = tighten(t.left);
        t.right = tighten(t.right);
        if (t.left != null && t.right == null) {
            return t.left;
        }
        if (t.left == null && t.right != null) {
            return t.right;
        }
        return t;
    }
}