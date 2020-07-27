package stack;

import java.util.Stack;

/**
 * 735. 行星碰撞
 */
public class AsteroidCollision {
    public static void main(String[] args) {
        int [] arr = {1,-2,-2};
        int [] brr = asteroidCollision(arr);
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if(!stack.isEmpty()){
                int top = stack.peek();
                if(asteroids[i] < 0) {
                    while(top > 0){
                        if(top < (-asteroids[i])){
                            stack.pop();
                            if(!stack.isEmpty()){
                                top = stack.peek();
                            }else{
                                stack.push(asteroids[i]);
                                break;
                            }
                        }else if(top == (-asteroids[i])){
                            stack.pop();
                            break;
                        }else{
                            break;
                        }
                    }
                    if(top < 0){
                        stack.push(asteroids[i]);
                    }
                }else{
                    stack.push(asteroids[i]);
                }
            }else{
                stack.push(asteroids[i]);
            }
        }
        int [] result = new int[stack.size()];
        int length = stack.size() -1;
        while(!stack.isEmpty()) {
           result[length] = stack.peek();
           length--;
           stack.pop();
        }
        return result;
    }
}
