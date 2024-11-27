import java.util.*;

public class UniqueTreeValues {
    Set<Integer> set = new HashSet<>();
    public int[] unique(TreeNode root) {
        populateSet(root);
        int[] ret = new int[set.size()];
        int i = 0;
        for (int n : set) {
            ret[i++] = n;
        }
        Arrays.sort(ret);
        return ret;
    }

    public void populateSet(TreeNode node) { // pre-order tree traversal
        if (node == null) return;
        set.add(node.info);
        populateSet(node.left);
        populateSet(node.right);
    }
}