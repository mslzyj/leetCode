package tree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 107. 二叉树的层次遍历 II
 */
public class OrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }

        List<TreeNode> listNode = new ArrayList<>();
        listNode.add(root);
        Stack<List<Integer>> stack = new Stack<>();
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
                stack.push(listTemp);
            }
        }
        while (!stack.isEmpty()){
            lists.add(stack.pop());
        }
        return  lists;
    }
}
