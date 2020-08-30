package arrays;

/**
 * @autor zyj
 * @date 2020/8/16 10:30
 * 5185. 存在连续三个奇数的数组
 */
public class ConsecutiveOdds {
    public static void main(String[] args) {
        int [] a = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(a));
    }

    public static  boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if(arr[i] % 2 == 1){
                if(arr[i+1] % 2 == 1 && arr[i + 2] % 2 == 1){
                    return true;
                }
            }
        }
        return false;
    }
}
