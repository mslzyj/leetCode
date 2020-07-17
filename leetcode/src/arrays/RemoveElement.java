package arrays;

/**
 * 27. 移除元素
 */
public class RemoveElement {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(arr,val));

    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int temp = 0;
        while (i <= j) {
            if(nums[j] == val){
                j--;
                continue;
            }
            if(nums[i] != val){
                i++;
                continue;
            }
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return i;
    }
}
