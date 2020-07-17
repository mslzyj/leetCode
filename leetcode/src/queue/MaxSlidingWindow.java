package queue;

import java.util.LinkedList;


public class MaxSlidingWindow {
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k =  3;
        int [] result = maxSlidingWindow(nums,k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",,,");
        }

    }
    public static  int[] maxSlidingWindow(int[] nums, int k) {
        int [] result = new int[nums.length - k + 1];
        if(nums.length == 0){
            return  new int[0];
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        int max = nums[0];
        //没有窗口的时候
        for (int i = 0; i < k; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        linkedList.add(max);
        //滑动窗口
        int n = 1;
        while(nums.length > 1 && (n + k) <= nums.length) {
            for (int i = n; i < n + k; i++) {
                if (i == n) {
                    max = nums[i];
                }
                if (i > n && nums[i] > max) {
                    max = nums[i];
                }

            }
            linkedList.add(max);
            n++;
        }
        for (int i = 0; i < linkedList.size(); i++) {
            result[i] = linkedList.get(i);
        }
        return result;
    }
}
