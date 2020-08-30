package greedy;

/**
 * 134. 加油站
 */
public class CanCompleteCircuit {
    public static void main(String[] args) {
      int []  gas  = {3,1,3,2};
      int []  cost = {3,2,3,1};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int c = 0;
        int sum = 0;
        int start = 0;
        int temp = 0;
        for (int i = 0; i < gas.length; i++) {
            c = gas[i] - cost[i];
            sum += c;
            temp += c;
            if(c < 0){
                start = i + 1;
                temp = 0;
            }
        }
        if(sum >= 0){
            return start;
        }
        return -1;
    }

}
