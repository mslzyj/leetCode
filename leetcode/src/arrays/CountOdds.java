package arrays;

/**
 * 统计low 到 high之间的奇数个数，包括 low, high
 */
public class CountOdds {
    public static void main(String[] args) {
        System.out.println(countOdds(3,7));
    }

    public static int countOdds(int low, int high) {
        int count  = 0;
        if(low % 2 == 0 && high % 2 == 0){
            count = (high - count) / 2 ;
        }else {
            count = (high - low) / 2 + 1;
        }
        return count;
    }

}
