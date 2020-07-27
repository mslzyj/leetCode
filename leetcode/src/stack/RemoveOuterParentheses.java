package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 1021. 删除最外层的括号
 */
public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        //"()()()()(())"
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String S) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put(')','(');
        String R = "";
        Stack<Integer> stack = new Stack();
        char [] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!stack.isEmpty()){
                Integer peek = stack.peek();
                if (chars[peek] == map.get(chars[i])) {
                    if(stack.size() == 1){
                        chars[peek] = 'x';
                        chars[i] = 'x';
                        stack.pop();
                        continue;
                    }else{
                        stack.pop();
                        continue;
                    }
                } else {
                    stack.push(i);
                }
            }else{
                stack.push(i);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if('x' != chars[i]){
                R += chars[i];
            }
        }
        return R;
    }
}
