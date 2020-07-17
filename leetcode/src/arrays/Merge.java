package arrays;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < nums2.length; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}
