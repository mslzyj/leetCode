package greedy;

import java.util.Arrays;

public class SumAfterKNegations {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{4,2,3}, 1));
    }
    public static int largestSumAfterKNegations(int[] A, int K) {
        int sum  = 0;
        //统计负数的个数
        int n = 0;
        for (int i : A) {
            if(i < 0){
                n++;
            }
        }
        Arrays.sort(A);
        //全正
        if(n == 0 && K % 2 == 1){
           A[0] = - A[0];
        }else if(n == A.length){ //全负
            for (int i = 0; i < K; i++) {
                A[i] = - A[i];
            }
        }else{  //一部分正。一部分负
            if(K <= n){
                for (int i = 0; i < K; i++) {
                    A[i] = - A[i];
                }
            }else{  // k > n
                for (int i = 0; i < n; i++) {
                    A[i] = - A[i];
                }
                K = K - n;
                Arrays.sort(A);
                if(K % 2 == 1){
                    A[0] = -A[0];
                }
            }
        }
        for (int i : A) {
            sum += i;
        }
        return sum;
    }
}
