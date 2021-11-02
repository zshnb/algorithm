package leetcode;

/**
 * 思路1：同时对2条链表遍历，判断当前节点哪个比较小，将其放入结果链表中，然后对应小的节点向后移动，遍历完后如果还有一条链表不为空，将其全部连接
 * 在结果链表上
 * */
public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode resultHead = new ListNode(-1);
        ListNode p3 = resultHead;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p3.next = new ListNode(p1.val);
                p1 = p1.next;
            } else {
                p3.next = new ListNode(p2.val);
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        if (p1 != null) {
            p3.next = p1;
        } else {
            p3.next = p2;
        }
        return resultHead.next;
    }
}
