package greedy;

import java.util.HashMap;

/**
 * 1553. 吃掉 N 个橘子的最少天数
 */
public class MinDays {
    public static void main(String[] args) {
        System.out.println(minDays1(10));
    }

    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static int minDays(int n) {
        return helper(n);
    }

    private static int helper(int n) {
        if (n == 1) {
            return 1;
        } else if (n <= 3) {
            return 2;
        } else if (!map.containsKey(n)) {
            int res = Integer.MAX_VALUE;

            int p = (n - n % 2) / 2;
            System.out.println("p="+ p + "  ");

            res = Math.min(res, helper((n - n % 2) / 2) + 1 + n % 2);


            int q = (n - n % 3) / 3;
            System.out.println("q="+ q);

            res = Math.min(res, helper((n - n % 3) / 3) + 1 + n % 3);
            map.put(n, res);
        }
        return map.get(n);
    }


    public static int minDays1(int n) {
        if (n <= 1) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int min = Integer.MAX_VALUE;
        min = Math.min(min, minDays1(n / 2) + (n % 2));
        min = Math.min(min, minDays1(n / 3) + (n % 3));
        min+=1;
        map.put(n, min);
        return min;
    }
}
