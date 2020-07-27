package greedy;

/**
 * 765. 情侣牵手
 */
public class SwapsCouples {

    public static void main(String[] args) {
        int [] a = {10,7,4,2,3,0,9,11,1,5,6,8};
        System.out.println(minSwapsCouples(a));
    }

    public static int minSwapsCouples(int[] row) {
        int result = 0;
        for (int i = 0; i < row.length - 1; i += 2) {
            for (int i1 = i + 1; i1 < row.length; i1++) {
                if(row[i] / 2 == row[i1] / 2){
                    if(i1 == i + 1){
                        break;
                    }else {
                        int temp = row[i1];
                        row[i1] = row[i + 1];
                        row[i + 1] = temp;
                        result++;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
