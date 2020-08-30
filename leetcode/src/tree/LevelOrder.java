package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        List<TreeNode> listNode = new ArrayList<>();
        listNode.add(root);
        while(listNode.size() > 0){
            List<TreeNode> list = new ArrayList<>();
            List<Integer> listTemp = new ArrayList<>();
            for (int i = 0; i < listNode.size();i++ ) {
                if(listNode.get(i).left != null) {
                    list.add(listNode.get(i).left);
                }
                if(listNode.get(i).right != null) {
                    list.add(listNode.get(i).right);
                }
                listTemp.add(listNode.get(i).val);
            }
            listNode.clear();
            listNode = list;
            if(listTemp.size() > 0) {
                lists.add(listTemp);
            }
        }
        return  lists;
    }

}
