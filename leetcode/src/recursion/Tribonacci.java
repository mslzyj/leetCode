package recursion;

/**
 * 1137. 第 N 个泰波那契数
 */
public class Tribonacci {

    public static void main(String[] args) {
        System.out.println(tribonacci(25));

    }
    public static  int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return recursion(0,1,1,n-2);
    }

    public static int recursion(int TN,int TN1,int TN2,int n ){
        int TN3 = TN + TN1 + TN2;
        n--;
        int result = TN3;
        if(n > 0) {
            result = recursion(TN1, TN2, TN3, n);
        }
        return result;
    }
}

