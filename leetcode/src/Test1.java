import java.util.Scanner;

/**
 * @autor zyj
 * @date 2020/9/5 14:09
 */
public class Test1 {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();*/
        int num = 90;
        int tmp = 2;
        System.out.print(num + "=");
        while (tmp <= num) {
            if (tmp == num) {
                System.out.println(num);
                break;
            } else if (num % tmp == 0) {
                System.out.print(tmp + "*");
                num = num / tmp;
            } else {
                tmp++;
            }
        }
    }
}
