package arrays;

import java.util.Random;

/**
 * 5507. 替换所有的问号
 * @autor zyj
 * @date 2020/9/6 10:41
 */
public class ModifyString {

    public static void main(String[] args) {
       String s = "?l?j??s??c???";
        System.out.println(modifyString(s));
    }


    public static String modifyString(String s) {
        String result = "";
        char a = 0;
        char b = 0;
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if('?' == chars[i]){
                if(i - 1 >= 0){
                   a = chars[i - 1];
                }
                if(i + 1 < chars.length){
                    if(chars[i +1] != '?'){
                       b = chars[i +1];
                    }
                }
                char tem = createChar();
                while(tem == a || tem == b){
                    tem = createChar();
                }
                chars[i] = tem;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
        return result;
    }

    public static  char createChar(){
        Random rand=new Random();
        char c = (char)(rand.nextInt(26)+'a');
        return c;
    }
}
