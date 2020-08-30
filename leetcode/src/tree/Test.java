package tree;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String [] str = {"1","2","3","4",null,"5"};
        TreeNode treeNode = create(str);
        FindTilt findTilt = new FindTilt();
        System.out.println(findTilt.findTilt(treeNode));

    }

    /**
     * 创建二叉树
     * @param arr
     * @return
     */
    public static TreeNode create( String [] arr){
        if(arr.length == 1){
            return new TreeNode(Integer.valueOf(arr[0]));
        }
        TreeNode [] brr = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                brr[i] = new TreeNode(Integer.valueOf(arr[i]));
            }
        }
        for (int i = 0; i < (( brr.length / 2) - 1); i++) {
            if(brr[i] != null){
                TreeNode left = brr[2 * i + 1];
                TreeNode right = brr[2 * i + 2];
                brr[i].left = left;
                brr[i].right = right;
            }
        }

        int size = arr.length;
        int end  =size / 2 -1;
        if(size % 2 == 0 && brr[end * 2 + 1] != null && brr[end] != null ){
            brr[end].left = brr[end * 2 + 1];
        }else{
            if(brr[end * 2 + 1] != null && brr[end] != null) {
                brr[end].left = brr[end * 2 + 1];
            }
            if(brr[end * 2 + 2] != null && brr[end] != null) {
                brr[end].right = brr[end * 2 + 2];
            }
        }
        return brr[0];
    }


    /**
     * 先序遍历
     */
    public static void pre(TreeNode treeNode){
       if(treeNode == null){
           return;
       }
        System.out.print(treeNode.val + " ");
        pre(treeNode.left);
        pre(treeNode.right);
    }

    /**
     * 中序遍历
     */
    public static void mid(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        mid(treeNode.left);
        System.out.print(treeNode.val + " ");
        mid(treeNode.right);
    }

    /**
     * 后续遍历
     */
    public static void rear(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        rear(treeNode.right);
        rear(treeNode.left);
        System.out.print(treeNode.val + " ");
    }

    /**
     * 层次遍历
     */
    public static void level(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(treeNode);
        while(list.size() > 0){
            List<TreeNode> tempList = new ArrayList<>();
            for (TreeNode node : list) {
                System.out.print(node.val + " ");
                if(node.left != null){
                    tempList.add(node.left);
                }
                if(node.right != null){
                    tempList.add(node.right);
                }
            }
            System.out.println();
            list.clear();
            list = tempList;
        }
    }
}
