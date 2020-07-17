package tree;

import tree.treeUtils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *94. 二叉树的中序遍历
 */
public class Inorderleft {


    public static void main(String[] args) {
        TreeNode n = new TreeNode(1,null,new TreeNode(2,new TreeNode(3,null,null),null));
        List<Integer> list =  inorderTraversal(n);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public static List<Integer> inorder(TreeNode root,List<Integer> list){
        if(root == null){
           return null;
        }

        inorder(root.getLeft(), list);
        list.add(root.getVal());
        inorder(root.getRight(),list);
        return list;
    }
}
