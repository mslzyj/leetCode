package greedy;

import java.util.Arrays;

/**
 * 455. 分发饼干
 */
public class ContentChildren {
    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = {1,2,3};
        System.out.println(findContentChildren(a, b));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int num = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
                num ++;
            }else{
                j++;
            }
        }
        return num;
    }

    /**
     * @autor zyj
     * @date 2020/8/16 10:50
     * 5488. 使数组中所有元素相等的最小操作数
     */
    public static class Operations {
        public static void main(String[] args) {
            System.out.println(minOperations(6));
        }

        public static int minOperations(int n) {
            if(n <= 1){
                return 0;
            }
            if(n == 2){
                return 1;
            }
            int sum = 0;
            int [] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (2 * i) + 1;
            }
            if(n % 2 == 1){
                int flag = arr[(n / 2) ];
                for (int i = (n / 2) + 1; i < arr.length; i++) {
                   sum += arr[i] - flag;
                }
            }else{
                int flag = arr[(n / 2) - 1] + 1;
                for (int i = (n / 2) ; i < arr.length; i++) {
                    sum += arr[i] - flag;
                }
            }
            return sum;
        }
    }
}
