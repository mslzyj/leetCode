package math;

import java.util.Stack;

/**
 * 415. 字符串相加
 */
public class AddStrings {
    public static void main(String[] args) {
        String num1 = "9";
        String num2 = "1";
        System.out.println(addStrings(num1, num2));

    }
    public static  String addStrings(String num1, String num2) {
        char [] A = num1.toCharArray();
        char [] B = num2.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int i = A.length - 1;
        int j = B.length - 1;
        int y = 0;
        while(i >= 0 || j >= 0){
            int temp = 0;
            if(i >= 0){
                temp += Integer.valueOf(String.valueOf(A[i]));
                i--;
            }
            if(j >= 0){
                temp += Integer.valueOf(String.valueOf(B[j]));
                j--;
            }
            temp += y;
            if(temp > 9){
                stack.push(temp % 10);
                y = temp / 10;
            }else{
                stack.push(temp);
                y = 0;
            }
        }
        if(y != 0){
            stack.push(y);
        }
        String result = "";
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
