package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor zyj
 * @date 2020/8/23 10:58
 * 1560. 圆形赛道上经过次数最多的扇区
 */
public class MostVisited {
    public static void main(String[] args) {
        int [] a = {3,2,1,2,1,3,2,1,2,1,3,2,3,1};
        int  n = 3;
        System.out.println(mostVisited(n, a));
    }

    public static List<Integer> mostVisited(int n, int[] rounds) {
        int [] arr = new int[n + 1];
        for (int i = 0; i < rounds.length - 1; i++) {
            if(i == 0){
                for (int j = rounds[0]; j <= n; j++) {
                    arr[j]++;
                }
            }else {
                if(rounds[i] > rounds[i + 1]) {
                    for (int j = 1; j <= n; j++) {
                        arr[j]++;
                    }
                }
            }
            if(i == rounds.length - 2){
                for (int j = 1; j <= rounds[rounds.length - 1]; j++){
                    arr[j]++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                list.add(i);
            }
        }
        return list;
    }
}
