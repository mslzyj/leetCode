package stack;

import java.util.Stack;

/**
 * 155. 最小栈
 */
public class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int a = minStack.getMin();
        minStack.pop();
        int b = minStack.top();
        int c = minStack.getMin();
        System.out.println(a+" "+b+" "+c);

    }
    Stack<Integer> stack;
    Stack<Integer> stackTemp;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        stackTemp = new Stack<>();
    }

    public void push(int x) {
       stack.push(x);
       if(!stackTemp.isEmpty()){
           int min = stackTemp.peek();
           if(x < min) {
               stackTemp.push(x);
           }else{
               stackTemp.push(min);
           }
       }else{
           stackTemp.push(x);
       }
    }

    //出栈
    public void pop() {
        stack.pop();
        stackTemp.pop();
    }
    //栈顶
    public int top() {
        return stack.peek();
    }

    //最小
    public int getMin() {
       return stackTemp.peek();
    }
}
