public class MaxPath {

    public int maxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.info + Math.max(maxPath(node.left), maxPath(node.right));
    }
    
}
