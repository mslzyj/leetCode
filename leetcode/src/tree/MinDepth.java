package tree;

/**
 * 111. 二叉树的最小深度
 */
public class MinDepth {

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        }
        if(root.right == null && root.left != null){
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
