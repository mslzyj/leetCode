package tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 56 - II. 数组中数字出现的次数 II
 */
public class SingleNumber {
    static Map<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int [] num = {2,4,2,2};
        System.out.println(singleNumber(num));
    }
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],value + 1);
            }else{
                map.put(nums[i],1);
            }

        }
        int n = 0;
       for (Integer key : map.keySet()){
           if(map.get(key) == 1){
               n = key;
           }
       }
       return n;

    }
}
