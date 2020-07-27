package stack;

import java.util.Stack;

/**
 * 682. 棒球比赛
 */
public class CalPoints {
    public static void main(String[] args) {
        String [] str = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(str));
    }

    public static int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if(!stack.isEmpty()){
                if("+".equals(ops[i])){
                    int top1 = stack.pop();
                    int top2 = stack.pop();
                    sum += top1;
                    sum += top2;
                    stack.push(top2);
                    stack.push(top1);
                    stack.push(top1 + top2);
                }else if("C".equals(ops[i])){
                    sum -= stack.pop();
                }else if("D".equals(ops[i])){
                    sum += 2 * stack.peek();
                    stack.push(2 * stack.peek());
                }else{
                    stack.push(Integer.valueOf(ops[i]));
                    sum += Integer.valueOf(ops[i]);
                }
            }else{
                stack.push(Integer.valueOf(ops[i]));
                sum += Integer.valueOf(ops[i]);
            }
        }
        return sum;
    }
}
