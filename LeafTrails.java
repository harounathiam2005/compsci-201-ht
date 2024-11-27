import java.util.*;

public class LeafTrails {
    Map<Integer,String> map = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        createEncoding(tree, "");
        String[] ret = new String[map.keySet().size()];
        int x = 0;
        for (int i : map.keySet()) {
            ret[x++] = map.get(i);
        }
        return ret;
    }

    public void createEncoding(TreeNode t, String code) {
        if (t == null) {
            return;
        }
        if (t.left == null && t.right == null) {
            map.put(t.info, code);
        }
        createEncoding(t.left, code + "0");
        createEncoding(t.right, code + "1");
    }
}
