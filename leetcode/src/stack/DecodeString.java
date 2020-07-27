package stack;

import java.util.Stack;

/**
 * 394. 字符串解码
 */
public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        //aaa  bc bc
        System.out.println(decodeString1(s));
    }

    public static String decodeString1(String s) {
        String temp = "";
        int k = 0;
        String sum = "";
        Stack<Character> stack  = new Stack<>();
        char [] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(!stack.isEmpty()){
                if(']' == chars[i]){
                    while('[' != stack.peek()){
                        temp += stack.pop();
                    }
                    stack.pop();
                    while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                        sum += stack.pop();
                    }
                    k = Integer.parseInt(String.valueOf(new StringBuffer(sum).reverse()));
                    sum = "";
                    temp = new StringBuffer(temp).reverse().toString();
                    char [] tempc = temp.toCharArray();
                    while (k > 0) {
                        for (int i1 = 0; i1 < tempc.length; i1++) {
                            stack.push(tempc[i1]);
                        }
                        k--;
                    }
                    temp = "";
                }else{
                    stack.push(chars[i]);
                }
            }else {
                stack.push(chars[i]);
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return new StringBuffer(result).reverse().toString();
    }
}
