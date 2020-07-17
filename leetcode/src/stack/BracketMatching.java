package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class BracketMatching {
    public static void main(String[] args) {
        String s = "";
        System.out.println(isValid(s));
    }

    public static  boolean isValid(String s) {
        if("".equals(s)){
            return true;
        }
        //将括号放入map中
        Map<String,String> map = new HashMap();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        map.put(")","(");
        map.put("}","{");
        map.put("]","[");
        //创建栈判断是否匹配
        Stack<String> stack = new Stack<>();
        char [] chars = s.toCharArray();
        int k = 0;
        judgematch(stack,chars,k,map);
        if(!stack.isEmpty()){
            return  false;
        }
        return true;
    }

    public static void judgematch(Stack stack,char [] chars,int k,Map map){
        int length = chars.length;
        if(!stack.isEmpty()){
            String s = (String)stack.pop();
            String str = Character.toString(chars[k]);
            //数组中的元素是否和栈顶匹配
            if(!map.get(str).equals(s)){
                //如果不匹配，入栈,把原出栈的s再放入栈中，并把数组中下一个元素放入栈中
                stack.push(s);
                stack.push(Character.toString(chars[k]));
            }
        }else{
            stack.push(Character.toString(chars[k]));
        }
        k++;
        if(k < length) {
            judgematch(stack, chars, k, map);
        }
    }

}
