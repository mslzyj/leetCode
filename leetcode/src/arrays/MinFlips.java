package arrays;

/**
 * 5473. 灯泡开关 IV
 */
public class MinFlips {
    public static void main(String[] args) {
        System.out.println(minFlips("001011101"));
    }

    public static int minFlips(String target) {
        char [] chars = target.toCharArray();
        int count = 0;
        int flag = 0;
        for (int i = 0; i < chars.length; i++) {
            if(flag != Integer.valueOf(String.valueOf(chars[i]))){
                count++;
                if(flag == 0){
                    flag = 1;
                }else{
                    flag = 0;
                }
            }
        }
        return count;
    }
}
