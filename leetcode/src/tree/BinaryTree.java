package tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BinaryTree {
    public static void main(String[] args) {
        int [] arr = {};
        int [] brr = {1,2,3,4,5,6,7,8};
        List<TreeNode> list = new ArrayList<>();
        createbinarytree(list,brr);
        preOrderTraverse(list.get(0));
        System.out.println("===================");
        inOrderTraverse(list.get(0));
        System.out.println("===================");
        postOrderTraverse(list.get(0));
        System.out.println("===================");
        System.out.println("树的最大深度："+maxDepth(list.get(0)));
        System.out.println("===================");
        System.out.println(isBalanced(list.get(0)));
        System.out.println("################");
        List<Integer> lists = inorderTraversal(list.get(0));
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }

    /**
     * 创建二叉树
     */
    public static void createbinarytree(List<TreeNode> list, int [] arr){
       //将所有的数值加入list集合
        for (int i = 0; i < arr.length; i++) {
            list.add(new TreeNode(Integer.valueOf(arr[i])));

        }
        //构造二叉树
        for (int i = 0; i < (arr.length / 2) -1; i++) {
            if(arr[i] != 0) {
                //左子树
                list.get(i).setLeft(list.get((i * 2) + 1));
                //右子树
                list.get(i).setRight(list.get((i * 2) + 2));
            }
        }
        //处理最后一个节点
        int maxLength = arr.length;
        int end = arr.length / 2 - 1;
        //如果是偶数，最后一个父节点只有一个左子树，如果是奇数，最后一个父节点有两个子节点
        if(maxLength % 2 == 0){
            list.get(end).setLeft(list.get(end * 2 + 1));
        }else{
            list.get(end).setLeft(list.get(end * 2 + 1));
            list.get(end).setRight(list.get(end * 2 + 2));
        }
    }

    /**
     * 先序遍历二叉树
     */
    public static void  preOrderTraverse(TreeNode treeNode){
        if(treeNode == null){
             return;
        }
        System.out.print(treeNode.getVal()+" ");
        preOrderTraverse(treeNode.getLeft());
        preOrderTraverse(treeNode.getRight());
    }

    /**
     * 中序遍历二叉树
     */
    public static void  inOrderTraverse(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        inOrderTraverse(treeNode.getLeft());
        System.out.print(treeNode.getVal()+" ");
        inOrderTraverse(treeNode.getRight());
    }

    /**
     * 后序遍历二叉树
     */
    public static void  postOrderTraverse(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        postOrderTraverse(treeNode.getLeft());
        postOrderTraverse(treeNode.getRight());
        System.out.print(treeNode.getVal()+" ");
    }

    /**
     * 树的深度
     */
    public static  int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树
     * 本题中，一棵高度平衡二叉树定义为：
     * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
     */
    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if( Math.abs(maxDepth(root.left) -  maxDepth(root.right)) > 1 ){
           return false;
        }
        return  isBalanced(root.left) && isBalanced(root.right);
    }

    /***
     * 94. 二叉树的中序遍历
     */
    private static List<Integer> listss = new ArrayList<>();
    public static  List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return null;
        }
        inorderTraversal(root.getLeft());
        listss.add(root.getVal());
        inorderTraversal(root.getRight());
        return listss;
    }



}
