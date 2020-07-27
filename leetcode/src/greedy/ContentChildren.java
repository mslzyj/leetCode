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
}
