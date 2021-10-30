package leetcode;

/**
 * 思路1：分别使用2条链表用于存放<x和>=x的节点，在遍历给定链表的时候构建出来，然后让<x链表的尾节点指向>=x链表的头节点
 * */
public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode smallHead = new ListNode(-1);
        ListNode largeHead = new ListNode(-1);
        ListNode smallCurr = smallHead;
        ListNode largeCurr = largeHead;
        ListNode p = head;
        while (p != null) {
            if (p.val < x) {
                smallCurr.next = new ListNode(p.val);
                smallCurr = smallCurr.next;
            } else {
                largeCurr.next = new ListNode(p.val);
                largeCurr = largeCurr.next;
            }
            p = p.next;
        }
        smallCurr.next = largeHead.next;
        return smallHead.next;
    }
}
