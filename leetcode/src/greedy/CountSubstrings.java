package greedy;

/**
 * 647. 回文子串
 */
public class CountSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aba"));
    }
    public static int countSubstrings(String s) {
        int sum = s.length();
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if(f(chars,i,j)){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static boolean f(char [] chars,int i,int j){
       while(i < j){
           if(chars[i] != chars[j]){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }

}
