package arrays;

/**
 * 922. 按奇偶排序数组 II
 */
public class Parity {
    public static void main(String[] args) {
        int [] arr = {2,3,1,1,4,0,0,4,3,3};
        int [] brr =  sortArrayByParityII(arr);
        for (int i = 0; i <brr.length ; i++) {
            System.out.print(brr[i]);
        }
    }

    public static  int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int [] arr  = new int[length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < length; i++) {
            if(A[i] % 2 == 0){
                arr[j] = A[i];
                j += 2;
            }
            if(A[i] % 2 != 0){
                arr[k] = A[i];
                k += 2;
            }
        }
        return arr;

    }


}
