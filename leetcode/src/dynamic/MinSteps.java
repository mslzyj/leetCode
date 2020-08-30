package dynamic;

/**
 * 650. 只有两个键的键盘
 *      解法：素数分解
 */
public class MinSteps {

    public static void main(String[] args) {
        System.out.println(minSteps(15));
    }

    public static int minSteps(int n) {
        if(n == 1){
            return 0;
        }
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                System.out.print(i + " ");
                n /= i;
                i--;
            }
        }
        sum += n;
        System.out.println(n);
        return sum;
    }
}
