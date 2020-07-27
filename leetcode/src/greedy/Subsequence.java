package greedy;

/**
 * 392. 判断子序列
 */
public class Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));

    }
    public static  boolean isSubsequence(String s, String t) {
       int i = 0;
       int j = 0;
       char [] sc = s.toCharArray();
       char [] tc = t.toCharArray();
       int num = 0;
       while(i < sc.length && j < tc.length){
           if(sc[i] == tc[j]){
               j++;
               i++;
               num++;
           }else{
               j++;
           }
       }
       if(num == sc.length){
           return true;
       }
        return false;
    }
}
