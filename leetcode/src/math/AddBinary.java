package math;

/**
 * 67. 二进制求和
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) +Integer.parseInt(b, 2) );
    }
}
