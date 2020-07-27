package heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 703. 数据流中的第K大元素
 */
public class KthLargest {
    Queue<Integer> queue = new PriorityQueue<>();
    private int k;
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(k, arr);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
    public KthLargest(int k, int[] nums) {
        for (int num : nums) {
            queue.add(num);
        }
        this.k = k;
    }

    public int add(int val) {
        queue.add(val);
        while(!queue.isEmpty() ){
            if(queue.size() > k){
                queue.poll();
            }else{
                break;
            }

        }
      return queue.peek();
    }
}
