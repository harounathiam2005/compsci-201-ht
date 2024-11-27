import java.util.*;

public class LeafCollector {
    List<StringBuilder> overList = new ArrayList<>();
    public String[] getLeaves(TreeNode tree) {
        if (tree == null) return new String[0];
        processTree(tree, new StringBuilder());
        String[] ret = new String[overList.size()];
        int i = 0;
        for (StringBuilder s : overList) ret[i++] = s.toString();
        return ret;
    }

    public StringBuilder processTree(TreeNode t, StringBuilder s) {
        if (t == null) {
            return s;
        }
        t.left = processTree(t.left, s);
        t.right = processTree(t.right, s);

    }

    /*
    
    public void processTree(TreeNode t, StringBuilder s) {
        if (t == null) {
            return;
        }
        processTree(t.left, s);
        processTree(t.right, s);
        if (t.left == null && t.right == null) {
            s.append(t.info + " ");
            t = null;
        }
        overList.add(s);
    }
     */
}
