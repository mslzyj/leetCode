package arrays;

/**
 * 只改变一个数字使数组变为升序
 */
public class NonDecreasing {

    public static void main(String[] args) {
        int [] arr = {2,3,2,1,4};
        System.out.print(sortArrayByParityII(arr));

    }
    public static boolean sortArrayByParityII(int[] nums) {
        int k = 0;
        if( (nums.length >= 2 ) && (nums[0] > nums[1])){
            k = 1;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if(((nums[i + 1] < nums[i - 1]) ) && (nums[i] > nums[i + 1])){
                return false;
            }
            if(nums[i] > nums[i + 1] ){
                k++;
                if( k >= 2 ){
                    return false;
                }
            }
        }
        return true;
    }
}
