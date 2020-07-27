package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 1249. 移除无效的括号
 */
public class MinRemoveToMakeValid {

    public static void main(String[] args) {
        String s  =  "))((";
        System.out.println(minRemoveToMakeValid(s));
    }

    public static String minRemoveToMakeValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('(',')');
        Stack<Integer> stack = new Stack<>();
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if('(' == chars[i]){
                stack.push(i);
            }
            if(')' == chars[i]){
               if(!stack.isEmpty()){
                   int peek = stack.peek();
                   if(chars[peek] == map.get(chars[i])){
                       stack.pop();
                   }else{
                       stack.push(i);
                   }
               }else{
                   stack.push(i);
               }
            }
        }
        while(!stack.isEmpty()){
            chars[stack.pop()] = ']';
        }
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if(']' != chars[i]){
                result += String.valueOf(chars[i]);
            }
        }
        return result;
    }
}
