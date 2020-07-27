package stack;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 */
public class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     * 将一个元素放入队列的尾部。
     * */
    public void push(int x) {
       while(!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }
       stack1.push(x);
       while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
       }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     * 从队列首部移除元素。
     * */
    public int pop() {
       return stack1.pop();
    }

    /**
     * Get the front element.
     * 返回队列首部的元素。
     * */
    public int peek() {
       return stack1.peek();
    }

    /**
     *  Returns whether the queue is empty.
     *  返回队列是否为空。
     * */
    public boolean empty() {
      return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */