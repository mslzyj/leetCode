package greedy;

/**
 * @autor zyj
 * @date 2020/8/16 11:16
 * 5490. 吃掉 N 个橘子的最少天数
 */
public class Days {
    public static void main(String[] args) {
        System.out.println(minDays(10));
    }

    public static int minDays(int n) {
        int sum = 0;
        while(n > 0){
            int a = 1;
            int b = 0;
            if(n % 2 == 0){
                b = n / 2;
            }
            int c = 0;
            if(n % 3 == 0){
                c = n / 2;
            }
            n = n - Math.max(a,Math.max(b,c));
            sum++;
        }
        return sum;
    }
}
