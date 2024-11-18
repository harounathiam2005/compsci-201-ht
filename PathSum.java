public class PathSum 
{
    public int hasPath(int target, TreeNode tree) 
    {
        if (tree == null) 
        {
            return 0;
        }
        
        if (tree.left == null && tree.right == null && tree.info == target) 
        {
            return 1;
        }

        int targetedNum = target - tree.info;

        return Math.max(hasPath(targetedNum, tree.left), hasPath(targetedNum, tree.right));
    }
}