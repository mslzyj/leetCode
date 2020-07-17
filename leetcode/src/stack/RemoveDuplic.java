package stack;

import java.util.Stack;

/**
 * 1047. 删除字符串中的所有相邻重复项
 */
public class RemoveDuplic {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static  String removeDuplicates(String S) {
       char [] chars = S.toCharArray();
       Stack<Character> stack = new Stack<>();
       StringBuffer stringBuffer = new StringBuffer();
       for (int i = 0; i < chars.length ; i++) {
           if(!stack.isEmpty()) {
               if (chars[i] == stack.peek()) {
                   stack.pop();
               } else {
                   stack.push(chars[i]);
               }
           }else{
               stack.push(chars[i]);
           }

       }
       while(!stack.isEmpty()){
           stringBuffer.append(stack.pop());
       }
       return stringBuffer.reverse().toString();
    }
}
