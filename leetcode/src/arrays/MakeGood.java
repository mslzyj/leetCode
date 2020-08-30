package arrays;

/**
 *1544. 整理字符串
 */
public class MakeGood {
    public static void main(String[] args) {
        String s = "djrDdRJD";
        System.out.print(makeGood(s));

    }
    public static String makeGood(String s) {
        int length = s.length();
        for (int i = 0; i < length ; i++) {
            s = f(s);
        }
        return s;
    }

    public static String f(String s){
        char [] chars = s.toCharArray();
        String temp = "";
        int i = 0;
        int  j = 1;
        while(j < chars.length){
            if( (Character.isUpperCase(chars[i]) && Character.isLowerCase(chars[j])) && (Character.toUpperCase(chars[i]) == Character.toUpperCase(chars[j]))){
                i+=2;
                j+=2;
                continue;
            } else if( Character.isUpperCase(chars[j]) && Character.isLowerCase(chars[i]) && (Character.toUpperCase(chars[i]) == Character.toUpperCase(chars[j]))){
                i+=2;
                j+=2;
                continue;
            }else{
                temp += chars[i];
                i++;
                j++;
            }
        }
        while(i < chars.length){
            temp += chars[i];
            i ++;
        }
        return temp;
    }
}
