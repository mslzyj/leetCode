package chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 */
public class Palindrome {
    public static void main(String[] args) {
        ListNode a = new ListNode();
        a.val = 1;
        a.next = new ListNode(2,new ListNode(1));
        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode listNode = head;
        while(listNode != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        int [] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
           arr[i] = list.get(i);
        }
        int j = arr.length -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[j] ){
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
