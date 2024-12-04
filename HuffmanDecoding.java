public class HuffmanDecoding {
      String[] alphabet = "abcdefghijklmnopqrstuvwxyz".toString().split("");
      TreeNode tree;
    public String decode(String archive, String[] dictionary) {
      tree = createTree(dictionary);
    }

    public TreeNode createTree(String[] bits) {
      TreeNode root = new TreeNode(0,null,null);
      for (int i = 0; i < bits.length; i++) {
            for (int x = 0; x < bits[i].length(); x++) {
                  create(root);
            }
      }
      return root;
    }

    public TreeNode create(TreeNode tree) {

    }
 }