package dynamic;

/**
 * 121. 买卖股票的最佳时机
 */
public class MaxProfit {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] > min && (prices[i] - min) > max){
                max = prices[i] - min;
            }
        }
        return max;
    }
}
