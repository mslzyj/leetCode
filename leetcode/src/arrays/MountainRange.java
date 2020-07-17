package arrays;

/**
 * 941. 有效的山脉数组
 */
public class MountainRange {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] A) {

        int length = A.length;
        if (length < 3 || length > 10000) {
            return false;
        }
        int i = 0;
        int j = length - 1;
        while (i != j) {
            if (A[i] > 10000 || A[i] < 0 || A[j] > 10000 || A[j] < 0) {
                return false;
            }
            if ((A[i] == A[i + 1]) || (A[j] == A[j - 1])) {
                return false;
            }
            if ((A[i] > A[i + 1]) && (A[j] > A[j - 1])) {
                return false;
            }
            if (A[i] < A[i + 1]) {
                i++;
            }
            if (A[j] < A[j - 1]) {
                j--;
            }
        }
        if ((j == length - 1) || (i == 0)) {
            return false;
        }

        return true;
    }
}

