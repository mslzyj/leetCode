package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 1441. 用栈操作构建数组
 */
public class BuildTarget {
    public static void main(String[] args) {
        int [] tar = {1,4};
        int n = 4;
        List list = buildArray(tar,n);
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i));
        }
    }


    public static  List<String> buildArray(int[] target, int n) {
        List<String> list  = new ArrayList<>();
        //需要入栈的元素的长度
        int length = target[target.length - 1];
        int k = 0;
        for (int i = 1; i <= length; i++) {
            if(i == target[k]){
                list.add("Push");
                k++;
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
