package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 */
public class Duplicate {
    public static void main(String[] args) {

        int [] arr = {1,2,3};
        System.out.println(containsDuplicate(arr));

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if(set.size() < nums.length){
            return true;
        }
        return false;
    }
}
