package competition;

/**
 * 1518. 换酒问题
 */
public class Bottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
      if(numBottles < numExchange){
          return numBottles;
      }
      return f(numBottles,numExchange) + numBottles;
    }

    public static int f(int numBottles, int numExchange){
        int s = numBottles / numExchange;
        int y = numBottles % numExchange;
        int h = s + y;
        int result =  s ;
        if(h >= numExchange) {
            result += f(h, numExchange);
        }
        return result;
    }
}

