package greedy;

/**
 * 1221. 分割平衡字符串
 */
public class BalancedStringSplit {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int sum = 0;
        char [] chars = s.toCharArray();
        int countL = 0;
        int countR = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'R'){
                countR++;
            }
            if(chars[i] == 'L'){
                countL++;
            }
            if(countL == countR){
                sum++;
                countL = 0;
                countR = 0;
            }
        }
        return sum;
    }
}
