package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 101. 对称二叉树
 */
public class Symmetric {
    List<Integer> listA = new ArrayList<>();
    List<Integer> listB = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        pre(root.left);
        rear(root.right);
        if(listA.size() != listB.size()){
            return false;
        }
        int j = listB.size() - 1;
        for (int i = 0; i < listA.size(); i++) {
           /* if(listA.get(i) != listB.get(j)){
                return false;
            }*/
            System.out.println(listA.get(i) + "  " + listB.get(j));
            j--;
        }
        return true;
    }

    public  void pre(TreeNode root) {
        if(root == null){
            return ;
        }
        listA.add(root.val);
        pre(root.left);
        pre(root.right);
    }

    public void rear(TreeNode root) {
        if(root == null){
            return ;
        }
        rear(root.left);
        rear(root.right);
        listB.add(root.val);

    }

}
