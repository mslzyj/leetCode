package greedy;

/**
 * 991. 坏了的计算器
 */
public class BrokenCalc {
    public static void main(String[] args) {
        System.out.println(brokenCalc(5, 8));
    }
    public static int brokenCalc(int X, int Y) {
        int sum = 0;
        if(Y <= X){
            return X - Y;
        }
        while(Y > X){
            sum++;
            if(Y % 2 == 1){
                Y++;
            }else{
                Y = Y /2;
            }
        }

        return sum + (X - Y);
    }
}
