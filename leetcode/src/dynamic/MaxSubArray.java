package dynamic;

/**
 * 面试题 16.17. 连续数列
 */
public class MaxSubArray {

    /**
     * O1
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int b = nums[0];
        int sum = b;
        for (int i = 1; i < nums.length; i++) {
            if (b < 0) {
                b = nums[i];
            } else {
                b += nums[i];
            }
            if (b > sum) {
                sum = b;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSubArray m = new MaxSubArray();
        System.out.println(m.maxSubArray(a));
    }
}
