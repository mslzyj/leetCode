package arrays;

/**
 * 7. 整数反转
 */
public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static  int reverse(int x) {

        int y = 0;
        if(x > 0){
            y = swap(x);
        }else if (x == 0){
            return 0;
        }else{
            y = -(swap(-x));
        }
        return y;
    }

    public static int swap(int x){
        long result = 0L;
        String str = "";
        while(x % 10 == 0){
           x = x / 10;
        }
        while( x > 0){
            str +=  x % 10;
          x = x / 10;
        }

        char [] a = str.toCharArray();
        int j = 0;
        for (int i = a.length -1; i >= 0 ; --i) {
            result += Integer.parseInt(String.valueOf(a[i])) * Math.pow(10,j);
            if(result > 2147483647){
                return 0;
            }
            j++;
        }
        return (int)result;
    }

}
