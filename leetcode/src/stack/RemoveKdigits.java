package stack;

import java.util.Stack;

/**
 * 402. 移掉K位数字
 */
public class RemoveKdigits {
    public static void main(String[] args) {
        String s = "1234567890";
        System.out.println(removeKdigits(s, 9));

    }

    public static String removeKdigits(String num, int k) {
        if(num.length() <= k){
            return "0";
        }
        boolean flag = true;
        char [] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != 0){
                int ia = Integer.valueOf(String.valueOf(chars[i]));
                int ib = Integer.valueOf(String.valueOf(chars[i-1]));
                if(ia < ib) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            return num.substring(0,num.length() - k);
        }
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if(!stack.isEmpty()){
              int top = stack.peek();
              while(!stack.isEmpty() && top > Integer.valueOf(String.valueOf(chars[i]))){
                  if(j < k) {
                      stack.pop();
                      top = stack.peek();
                      j++;
                  }else{
                      break;
                  }
              }
              stack.push(Integer.valueOf(String.valueOf(chars[i])));
            }else {
               stack.push(Integer.valueOf(String.valueOf(chars[i])));
            }
        }
        while(j < k && !stack.isEmpty()){
            stack.pop();
            j++;
        }
        String result = "";
        while(!stack.isEmpty()){
           result += stack.pop();
        }
        return String.valueOf(Integer.parseInt(new StringBuffer(result).reverse().toString()));
    }
}
