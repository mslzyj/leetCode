package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 */
public class Preorder {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return null;
        }
        list.add(root.val);
        for (int i = 0; i < root.children.size() - 1; i++) {
            preorder(root.children.get(i));
        }

        return list;
    }
}
