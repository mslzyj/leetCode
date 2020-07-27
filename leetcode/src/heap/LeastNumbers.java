package heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 剑指 Offer 40. 最小的k个数
 */
public class LeastNumbers {
    public static void main(String[] args) {
        int [] arr = {4,5,1,6,2,7,3,8};
        int [] brr = getLeastNumbers(arr,4);
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }

    public static  int[] getLeastNumbers(int[] arr, int k) {
        //(v1, v2) -> v2 - v1 接受2个参数(数字),并返回他们的差值
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int i : arr) {
            queue.add(i);
            if(queue.size() > k){
                queue.poll();
            }
        }
        int [] reult = new int[queue.size()];
        int i = 0;
        while(!queue.isEmpty()){
          reult[i] = queue.poll();
          i++;
        }
        return reult;
    }

}
