package arrays;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println( kthSmallest(matrix,3));
    }

    public static  int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int [] arr = new int[n * n];
        int r = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[r] = matrix[i][j];
                r++;
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
