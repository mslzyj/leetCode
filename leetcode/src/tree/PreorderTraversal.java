package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 */
public class PreorderTraversal {
    List<Integer> preorderList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return preorderList;
        }
        preorderList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return preorderList;
    }
}
