package heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 1046. 最后一块石头的重量
 */
public class StoneWeight {
    public static void main(String[] args) {
      int [] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }

    public static  int lastStoneWeight(int[] stones) {

        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int stone : stones) {
            queue.add(stone);
        }
        int y = 0;
        int x = 0;
        while(queue.size() > 1){
            y = queue.poll();
            x = queue.poll();
            if(x == y){
                continue;
            }else{
                queue.add(y-x);
            }
        }
        if(queue.size() > 0){
            return queue.peek();
        }
        return 0;
    }
}
