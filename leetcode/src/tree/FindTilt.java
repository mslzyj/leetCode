package tree;

/**
 * 563. 二叉树的坡度
 */
public class FindTilt {

    int sum = 0;
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        mid(root);
        return sum;
    }

    public int mid(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = mid(root.left);
        int right = mid(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }
}
