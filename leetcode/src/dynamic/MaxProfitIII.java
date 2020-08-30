package dynamic;

/**
 * 123. 买卖股票的最佳时机 III
 * 参考：https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/discuss/108870/Most-consistent-ways-of-dealing-with-the-series-of-stock-problems
 */
public class MaxProfitIII {
    public static void main(String[] args) {
        int [] arr = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(arr));
    }
    public static  int maxProfit(int[] prices) {
        int T_i10 = 0;
        int T_i11 = Integer.MIN_VALUE;
        int T_i20 = 0;
        int T_i21 = Integer.MIN_VALUE;

        for (int price : prices) {
            T_i20 = Math.max(T_i20, T_i21 + price);
            T_i21 = Math.max(T_i21, T_i10 - price);
            T_i10 = Math.max(T_i10, T_i11 + price);
            T_i11 = Math.max(T_i11, -price);
            System.out.println();
        }

        return T_i20;
    }
}
