package stack;

import java.util.Stack;

/**
 * 739. 每日温度
 */
public class DailyTemperatures {
    public static void main(String[] args) {
        int [] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int [] brr = dailyTemperatures1(arr);
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

    }
    public static int[] dailyTemperatures1(int[] T) {
        int [] arr = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            if(!stack.isEmpty()){
                int top = stack.peek();
                    while(top >= 0 && T[i] > T[top]){
                        arr[top] = i - top;
                        stack.pop();
                       if(!stack.isEmpty()){
                           top = stack.peek();
                       }else{
                           stack.push(i);
                           top = -1;
                       }
                    }
                    stack.push(i);
            }else{
                stack.push(i);
            }
        }
        return arr;
    }
}
