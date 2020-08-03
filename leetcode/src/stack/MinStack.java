package stack;

import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 */
public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
      stack.push(x);
      if(!stackMin.isEmpty()){
          if(x < stackMin.peek()){
              stackMin.push(x);
          }else{
              stackMin.push(stackMin.peek());
          }
      }else{
          stackMin.push(x);
      }
    }

    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
            stackMin.pop();
        }
    }
    public int top() {
      return stack.peek();
    }

    public int min() {
      return stackMin.peek();
    }
}
