package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N叉树的后序遍历
 */
public class Postorder {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root == null){
            return null;
        }
        for (int i = 0; i < root.children.size() - 1; i++) {
            postorder(root.children.get(i));
        }
        list.add(root.val);
        return list;
    }
}
