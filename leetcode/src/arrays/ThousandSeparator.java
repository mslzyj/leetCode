package arrays;

import jdk.nashorn.internal.objects.annotations.Where;

import java.util.Stack;

/**
 * 5479. 千位分隔数
 * @autor zyj
 * @date 2020/8/22 23:15
 */
public class ThousandSeparator {
    public static void main(String[] args) {

        System.out.println(thousandSeparator(12877634));
    }

    public static String thousandSeparator(int n) {
        String s = String.valueOf(n);
        char [] chars = s.toCharArray();
        int k = chars.length - 1;
        int j = 0;
        Stack<Character> stack = new Stack<>();
        while (k >= 0){
           if(j < 3){
               stack.add(chars[k]);
               j++;
               k--;
           }else{
               stack.add('.');
               j = 0;
           }

        }
        String result = "";
        while (!stack.isEmpty()){
            result += String.valueOf(stack.pop());
        }
        return result;
    }
}
