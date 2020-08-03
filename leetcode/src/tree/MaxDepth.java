package tree;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 */
public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


}
