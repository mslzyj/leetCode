package arrays;

import java.util.Arrays;
/**
 * 滑动窗口中位数
 */
public class Median {
    public static void main(String[] args) {
        int [] a = {2147483647,2147483647};
        int k = 2;
        double [] b = medianSlidingWindow(a,k);
        for (int i = 0; i < b.length ; i++) {
            System.out.println(b[i]);
        }
    }
    public static  double[] medianSlidingWindow(int[] nums, int k) {
        int num = nums.length - k + 1;
        double [] arr = new double[num];
        double [] temp = new double[k];
        int j;
        double med;
        int g = 0;
        while(g <= nums.length - k) {
            j = 0;
            for (int i = g; i < g + k ; i++) {
                temp[j] = nums[i];
                j++;
            }

            //排序
            Arrays.sort(temp);
            if(k % 2 == 0){
                med = (temp[k / 2] + temp[k / 2 -1]) / 2;
            }else{
                med = temp[k / 2];
            }
            arr[g] = med;
            g++;
        }
        return arr;
    }
}

