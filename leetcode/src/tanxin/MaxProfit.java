package tanxin;

/**
 * 122. 买卖股票的最佳时机 II
 */
public class MaxProfit {
    public static void main(String[] args) {
        int [] arr = {6,1,3,2,4,7};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
      if(isIncrement(prices)){
          return (prices[prices.length - 1] - prices[0]);
      }
      if(isLess(prices)){
          return 0;
      }
      int max = 0;
      int i = 0;
      int j = 0;
      while (j < prices.length - 1){
          if(prices[j] < prices[j + 1]){
              j++;
              if(j == prices.length - 1){
                  max += prices[j] - prices[i];
              }
          }else {
             max += prices[j] - prices[i];
             i = j+1;
             j++;
          }
      }

      return max;
    }

    /**
     * 是否递增
     * @return
     */
    public static Boolean isIncrement(int[] prices){
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i] > prices[i + 1]){
                return false;
            }
        }
        return true;
    }

    /**
     * 是否递减
     * @return
     */
    public static Boolean isLess(int[] prices){
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i + 1]){
                return false;
            }
        }
        return true;
    }

}
