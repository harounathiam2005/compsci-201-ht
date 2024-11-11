public class TreeCount {
    public int count(TreeNode tree) {
        int numTrees = 0;
        if (tree != null) {
            System.out.println(tree);
            numTrees += 1 + count(tree.left) + count(tree.right);
        }
        return numTrees;
    }
}