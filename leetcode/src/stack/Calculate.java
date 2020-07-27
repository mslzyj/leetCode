package stack;

import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 */
public class Calculate {
    public static void main(String[] args) {
        String str = "1-(5)";
        System.out.println(calculate(str));
    }

    public static int calculate(String s) {

        char [] chars = s.toCharArray();
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])){
                flag = false;
                break;
            }
        }
        if(flag){
            return Integer.valueOf(s);
        }
        Set<Character> set = new HashSet<>();
        set.add(')');
        set.add('(');
        set.add('+');
        set.add(' ');
        int result = 0;
        String temp = "";
        Stack<Integer> stack = new Stack<>();
        for (int i = chars.length - 1; i >= 0; i--) {
            //数字
            if(set.contains(chars[i])){
                if(!"".equals(temp)){
                    temp = new StringBuilder(temp).reverse().toString();
                    stack.push(Integer.valueOf(temp));
                    temp = "";
                }
            }else if('-' == chars[i]) {
                temp = new StringBuilder(temp).reverse().toString();
                stack.push(-Integer.valueOf(temp));
                temp = "";
            }else{
                temp += chars[i];
            }
        }
        if(!"".equals(temp)){
            temp = new StringBuilder(temp).reverse().toString();
          stack.push(Integer.valueOf(temp));
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }

       return result;
    }
}
