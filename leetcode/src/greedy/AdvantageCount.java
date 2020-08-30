package greedy;

import java.util.*;

/**
 * 870. 优势洗牌
 */
public class AdvantageCount {
    public static void main(String[] args) {
        int [] A = {5621,1743,5532,3549,9581};
        int [] B = {913,9787,4121,5039,1481};
        int [] c = advantageCount(A,B);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static int[] advantageCount(int[] A, int[] B) {
        int[] sortedA = A.clone();
        Arrays.sort(sortedA);
        int[] sortedB = B.clone();
        Arrays.sort(sortedB);

        Map<Integer, Deque<Integer>> assigned = new HashMap();
        for (int b: B) {
            assigned.put(b, new LinkedList());
        }

        Deque<Integer> remaining = new LinkedList();

        int j = 0;
        for (int a: sortedA) {
            if (a > sortedB[j]) {
                assigned.get(sortedB[j++]).add(a);
            } else {
                remaining.add(a);
            }
        }
        int[] ans = new int[B.length];
        for (int i = 0; i < B.length; ++i) {
            if (assigned.get(B[i]).size() > 0) {
                ans[i] = assigned.get(B[i]).pop();
            } else {
                ans[i] = remaining.pop();
            }
        }
        return ans;
    }

}
