package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 225. 用队列实现栈
 */
public class MyStack {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
       if(list1.size() > 0){
           for (int i = 0; i < list1.size(); i++) {
               list2.add(list1.get(i));
           }
           list1 = new ArrayList<>();
       }
       list1.add(x);
       if(list2.size() > 0){
            for (int i = 0; i < list2.size(); i++) {
                list1.add(list2.get(i));
            }
            list2 = new ArrayList<>();
       }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       int pop = list1.get(0);
       list1.remove(0);
       return pop;
    }

    /** Get the top element. */
    public int top() {
      return list1.get(0);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
      if(list1.size() > 0){
          return false;
      }
      return true;
    }
}
