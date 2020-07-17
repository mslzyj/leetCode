package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static  int romanToInt(String s) {
        Map<String,Integer> map = new HashMap();
        Map<String,Integer> mapLess = new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        mapLess.put("IV",2);
        mapLess.put("IX",2);
        mapLess.put("XL",20);
        mapLess.put("XC",20);
        mapLess.put("CD",200);
        mapLess.put("CM",200);
        int result = 0;
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            char c = chars[i];
            result += map.get(String.valueOf(chars[i]));
        }
        int i = 0;
        while(i < chars.length - 1){
            int j = i + 1;
            String temp = String.valueOf (chars[i]) + String.valueOf(chars[j]);
            if(mapLess.containsKey(temp)){
                result -= mapLess.get(temp);
            }
            i++;
        }
        return result;
    }
}
