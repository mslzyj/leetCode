package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 17.12. BiNode  未完。。。。。
 * 二叉树数据结构TreeNode可用来表示单向链表（其中left置空，right为下一个链表节点）。
 * 实现一个方法，把二叉搜索树转换为单向链表，要求依然符合二叉搜索树的性质，
 * 转换操作应是原址的，也就是在原始的二叉搜索树上直接修改。
 * 返回转换后的单向链表的头节点
 * <p>
 * 二叉搜索树:
 * 1.若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
 * 2.若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
 * 3.它的左、右子树也分别为二叉排序树。
 */
public class BiNode {

    List<TreeNode> list = new ArrayList<>();
    public TreeNode convertBiNode(TreeNode root) {
        if(root == null){
            return null;
        }
        rear(root);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }
        return list.get(0);
    }

    public  void rear(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        rear(treeNode.left);
        list.add(treeNode);
        rear(treeNode.right);
    }
}
