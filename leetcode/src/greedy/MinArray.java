package greedy;

import java.util.Arrays;

public class MinArray {
    public static void main(String[] args) {
      int [] a = {2,2,2,0,1};
        System.out.println(minArray(a));
    }
    public static int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
