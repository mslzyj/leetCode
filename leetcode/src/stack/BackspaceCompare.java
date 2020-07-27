package stack;

import java.util.Stack;

/**
 * 844. 比较含退格的字符串
 */
public class BackspaceCompare {

    public static void main(String[] args) {
        String S = "y#fo##f";
        String T = "y#f#o##f";
        System.out.println(backspaceCompare(S,T));
    }
    public static  boolean backspaceCompare(String S, String T) {
        char [] sc = S.toCharArray();
        char [] tc = T.toCharArray();
        Stack<Character> stackSc = pushstack(sc);
        Stack<Character> stackTc = pushstack(tc);
        String strsc = "";
        String strtc = "";
        while(!stackSc.isEmpty() ){
            if('#' != stackSc.peek()) {
                strsc += stackSc.pop();
            }else{
                stackSc.pop();
            }
        }
        while(!stackTc.isEmpty() ){
            if('#' != stackTc.peek()) {
                strtc += stackTc.pop();
            }else{
                stackTc.pop();
            }
        }
        return strsc.equals(strtc);
    }

    private static Stack pushstack(char[] chars) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if(!stack.isEmpty()){
                if('#' == chars[i]){
                    stack.pop();
                }else{
                    stack.push(chars[i]);
                }
            }else {
                stack.push(chars[i]);
            }
        }
        return stack;
    }
}
