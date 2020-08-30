package greedy;

import java.util.Arrays;

/**
 * 1029. 两地调度
 */
public class TwoCitySchedCost {
    public static void main(String[] args) {
        int [][] a = {{10,20},{30,200},{400,50},{30,20}};
        System.out.println(twoCitySchedCost(a));
    }
    public static  int twoCitySchedCost(int[][] costs) {
        int [] a = new int[costs.length];
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i][0];
            a[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            sum += a[i];
        }
        return sum;
    }
}
