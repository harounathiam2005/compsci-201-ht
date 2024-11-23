public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if (tree == null) {
            return 0;
        }

        int leftMax = hasPath(target-tree.info, tree.left);
        int rightMax = hasPath(target-tree.info, tree.right);

        return tree.info + Math.max(leftMax, rightMax);
    }
}
