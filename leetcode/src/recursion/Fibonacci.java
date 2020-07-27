package recursion;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(1));
    }

    public static int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 2 || n==1){
            return 1;
        }
        int x = 0;
        int y = 1;
        for (int i = 1; i < n; i++)
        {
            y = x + y;
            x = y - x;
            y %= 1000000007;
        }
        return y ;
    }
}
