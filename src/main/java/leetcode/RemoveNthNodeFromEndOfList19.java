package leetcode;

/**
 * 思路1：遍历一次计算长度，然后再遍历一次删掉对应位置节点<br>
 * 思路2：快慢指针，先让慢指针往前走n + 1步，然后2个指针一起走，直到快指针为null，慢指针指向的就是要删除节点的前一个节点。快慢指针之间相差n个节点，
 * 因为倒数第n个节点就是从链表尾向前数n个。
 * */
public class RemoveNthNodeFromEndOfList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        if (n > length) return null;
        ListNode virtualHead =  new ListNode(-1, head);
        p = virtualHead;
        int i = 1;
        while (i != (length + 1 - n)) {
            p = p.next;
            i++;
        }
        p.next = (p.next.next == null ? null : p.next.next);
        return virtualHead.next;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null) return null;
        ListNode virtualHead =  new ListNode(-1, head);
        ListNode p = virtualHead;
        ListNode q = p;
        int i = 0;
        while (i != (n + 1)) {
            q = q.next;
            i++;
        }
        while (q != null) {
            p = p.next;
            q = q.next;
        }
        p.next = (p.next.next == null ? null : p.next.next);
        return virtualHead.next;
    }
}
