package tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] arr = {"3","9","20",null,null,"15","7"};
        String [] brr = {"1","2",null,"4"};
        //TreeNode root = createtree(brr);
        //测试  MaxDepth
        //System.out.println(MaxDepth.maxDepth(root));
        //测试  MinDepth
        //System.out.println(MinDepth.minDepth(root));

        //测试MergeTrees
      /*  String [] tr1 = {"1","3","2","5"};
        String [] tr2 = {"2","1","3",null,"4",null,"7"};

        TreeNode t1 = createtree(tr1);
        TreeNode t2 = createtree(tr2);
        MergeTrees.mergeTrees(t1,t2);
        preOrderTraverse(t1);*/

        //测试InvertTree
       /* String [] r = {"4","2","7","1","3","6","9"};
        TreeNode treeNode = InvertTree.invertTree(createtree(r));
        preOrderTraverse(treeNode);*/

        //测试Symmetric
        String [] r = {"1","2","2",null,"3",null,"3"};
        TreeNode root = createtree(r);
        Symmetric symmetric = new Symmetric();
        symmetric.isSymmetric(root);



    }

    public static TreeNode createtree( String [] arr){
        if(arr.length == 1){
            return new TreeNode(Integer.valueOf(arr[0]));
        }
        List<TreeNode> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                list.add(new TreeNode(Integer.valueOf(arr[i])));
            }else{
                list.add(new TreeNode(-1));
            }
        }

        for (int i = 0; i < (( arr.length / 2) - 1); i++) {
            if(list.get(i).val != -1) {
                TreeNode left = list.get(2 * i + 1);
                TreeNode right = list.get(2 * i + 2);
                if(left.val != -1){
                    list.get(i).left = left;
                }
                if(right.val != -1){
                    list.get(i).right = right;
                }
            }
        }

        int size = arr.length;
        int end  =size / 2 -1;
        if(size % 2 == 0){
            list.get(end).left = list.get(end * 2 + 1);
        }else{
            list.get(end).left = list.get(end * 2 + 1);
            list.get(end).right = list.get(end * 2 + 2);
        }
        return list.get(0);
    }

    //先序遍历
    /**
     * 先序遍历二叉树
     */
    public static void  preOrderTraverse(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        if(treeNode.getVal() == -1){
            System.out.print("null" + " ");
        }else{
            System.out.print(treeNode.getVal()+" ");
        }
        preOrderTraverse(treeNode.getLeft());
        preOrderTraverse(treeNode.getRight());
    }
}
