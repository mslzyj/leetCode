package arrays;

import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321 ));

    }
    public static  boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        Stack<Integer> stack  = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while(x > 0){
           stack.add(x % 10);
           stack1.add(x % 10);
           x = x / 10;
        }
        while(!stack.isEmpty()){
            stack2.add(stack.pop());
        }
        while(!stack2.isEmpty()){
            if(stack1.pop() != stack2.pop()){
                return false;
            }
        }
        return  true;
    }
}
