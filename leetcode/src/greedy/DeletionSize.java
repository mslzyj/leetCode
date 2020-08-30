package greedy;

/**
 * 944. 删列造序
 */
public class DeletionSize {

    public static void main(String[] args) {
        String [] a = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(a));
    }
    public static int minDeletionSize(String[] A) {
        int sum = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) > A[j+1].charAt(i)) {
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }
}
