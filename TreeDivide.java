import java.util.*;

public class TreeDivide {

    TreeNode create(String[] list) {
        if (list.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(list[(list.length-1)/2].length());
        String[] newListLeft = Arrays.copyOfRange(list, 0, list.length/2);
        String[] newListRight = Arrays.copyOfRange(list, (list.length/2) +1, list.length);
        root.left = create(newListLeft);
        root.right = create(newListRight);
        return root;
    }

    /*
     * TreeNode create(String[] list) {
        return buildTree(list, 0, list.length - 1);
    }

    TreeNode buildTree(String[] list, int start, int end) {
        TreeNode root = new TreeNode(0);
        if (start > end) {
            return null;
        }
        int mid = (end - start) / 2;
        root = new TreeNode(list[mid].length());
        root.left = buildTree(list, start, mid - 1);
        root.right = buildTree(list, mid + 1, end);
        return root;
    }
     */
}
