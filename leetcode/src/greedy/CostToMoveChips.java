package greedy;

/**
 * 1217. 玩筹码
 */
public class CostToMoveChips {
    public static void main(String[] args) {
        int [] a = {2,2,2,3,3,};
        System.out.println(minCostToMoveChips(a));
    }
    public static int minCostToMoveChips(int[] chips) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < chips.length; i++) {
            if(chips[i] % 2 == 0){
                a++;
            }else {
                b++;
            }
        }
        return a > b ? b : a;
    }
}
