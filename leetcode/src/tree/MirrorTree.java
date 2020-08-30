package tree;

/**
 * 剑指 Offer 27. 二叉树的镜像
 */
public class MirrorTree {

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
           return null;
        }
        TreeNode node = new TreeNode();
        node = root.left;
        root.left = root.right;
        root.right = node;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
