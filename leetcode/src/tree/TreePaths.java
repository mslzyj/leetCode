package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 257. 二叉树的所有路径
 */
public class TreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<String> stack = new Stack<>();
        pre(list,root,stack);
        return list;
    }

    public List<String> pre(List<String> list, TreeNode root, Stack<String> stack){
        if(root == null){
            return list;
        }
        if(root.left == null && root.right == null){
            if(!stack.isEmpty()) {
                String temp = stack.peek();
                temp = temp + "->" + root.val;
                list.add(temp);
            }else{
                list.add(String.valueOf(root.val));
            }
            return list;
        }else {
            if(stack.isEmpty()) {
                stack.push(String.valueOf(root.val));
            }else{
                String temp = stack.peek();
                temp = temp + "->" + root.val;
                stack.push(temp);
            }
        }
        pre(list, root.left, stack);
        pre(list, root.right, stack);
        stack.pop();
        return list;
    }

}
