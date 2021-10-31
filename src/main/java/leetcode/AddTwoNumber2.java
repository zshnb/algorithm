package leetcode;

/**
 * 思路1：定义结果链表，同时遍历2条链表，将2边节点相加后的值插入结果链表，注意处理进位，然后再将剩下一条链表多出来的部分继续遍历添加到结果链表，同样处理进位
 * */
public class AddTwoNumber2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode resultHead = new ListNode(-1);
        ListNode p = resultHead;
        int flag = 0;
        while (p1 != null && p2 != null) {
            int num = p1.val + p2.val + flag;
            if (num > 9) {
                flag = 1;
                num -= 10;
            } else {
                flag = 0;
            }
            p.next = new ListNode(num);
            p = p.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p1 == null) {
            while (p2 != null) {
                int num = p2.val + flag;
                if (num > 9) {
                    flag = 1;
                    num -= 10;
                } else {
                    flag = 0;
                }
                p.next = new ListNode(num);
                p = p.next;
                p2 = p2.next;
            }
        } else {
            while (p1 != null) {
                int num = p1.val + flag;
                if (num > 9) {
                    flag = 1;
                    num -= 10;
                } else {
                    flag = 0;
                }
                p.next = new ListNode(num);
                p = p.next;
                p1 = p1.next;
            }
        }
        if (flag == 1) {
            p.next = new ListNode(1);
        }
        return resultHead.next;
    }
}
