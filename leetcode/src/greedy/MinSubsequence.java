package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1403. 非递增顺序的最小子序列
 */
public class MinSubsequence {
    public static void main(String[] args) {
        int [] a = {8};
        List<Integer> list = minSubsequences(a);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static List<Integer> minSubsequences(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 2){
            list.add(nums[1]);
            if(nums[1] == nums[0]){
                list.add(nums[0]);
            }
            return list;
        }
        int i = 0;
        int j = nums.length - 1;
        int sum = nums[i];
        int min = nums[j];
        list.add(nums[j]);
        while(j - i > 1){
           if(sum + nums[i + 1] < min){
              i++;
              sum+=nums[i];
           }else if(sum + nums[i + 1] > min){
               j--;
               min += nums[j];
               list.add(nums[j]);
           }else{
               if(sum + nums[i + 1] < min){
                   i++;
                   sum+=nums[i];
               }else{
                   j--;
                   min += nums[j];
                   list.add(nums[j]);
               }
           }
        }
        return list;
    }
}
