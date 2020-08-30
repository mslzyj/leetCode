package greedy;

import java.util.Arrays;

/**
 * 948. 令牌放置
 */
public class BagOfTokensScore {
    public static void main(String[] args) {
        int [] t = {100,200,300,400};
        int  p = 200;
        System.out.println(bagOfTokensScore(t, p));
    }
    public static int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int sum = 0;
        int i = 0;
        int j = tokens.length - 1;
        while(i <= j){
            if(P >= tokens[i]){
                P -= tokens[i];
                sum++;
                i++;
            }else{
                if(sum > 0 && i < j){
                    P += tokens[j];
                    sum--;
                    j--;
                }else{
                    break;
                }
            }
        }
        return sum;
    }
}
