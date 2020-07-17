package chain;



/**
 * 21. 合并两个有序链表
 */
public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        a.val = 1;
        a.next = new ListNode(2,new ListNode(3));
        b.val = 1;
        b.next = new ListNode(2,new ListNode(3));
        System.out.println("a"+a.toString());
        System.out.println("b"+b.toString());
        ListNode c = mergeTwoLists1(a,b);
        System.out.println(c.toString());

    }

    public static  ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }


}
