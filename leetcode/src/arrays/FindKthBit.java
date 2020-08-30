package arrays;

/**
 * 1545. 找出第 N 个二进制字符串中的第 K 位
 */
public class FindKthBit {
    public static void main(String[] args) {
        System.out.println(findKthBit(3,1));
    }

    public static  char findKthBit(int n, int k) {
        String S1 = "0";
        if(n == 1){
            return '0';
        }
        //当 i > 1 时，Si = Si-1 + "1" + reverse(invert(Si-1))
        String Sn = "";
        String Si_1 = S1;
        for (int i = 2; i<= n; i++){
            Sn =  Si_1 + "1" + reverse(invert(Si_1));
            Si_1 = Sn;
        }
       return Sn.toCharArray()[k-1];
    }

    public static  String reverse(String x){
        StringBuffer sb = new StringBuffer(x);
        return sb.reverse().toString();
    }

    public static  String invert(String x){
        String temp = "";
        char [] chars = x.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if('0' == chars[i]){
               temp += "1";
            }else{
                temp += "0";
            }
        }
        return temp;
    }
}
