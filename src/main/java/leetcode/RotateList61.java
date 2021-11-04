package leetcode;

/**
 * 思路：使用快慢指针，先计算链表长度，然后让1个指针移动k位，再让2个指针同时移动，直到1个指针移动到末尾，然后让前面的指针next变为新的头节点，再把
 * 前面指针的next置为null，最后把后面指针的next指向原来的头节点
 * */
public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;
        ListNode p, q;
        p = head;
        q = head;
        int length = 0;
        while (p != null) {
            length++;
            p = p.next;
        }
        if (length == 1 || length == k || (k != 1 && k > length && length % k == 0) || k % length == 0) return head;
        p = head;
        while (k % length> 0) {
            q = q.next;
            k--;
        }
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        ListNode newHead = p.next;
        q.next = head;
        p.next = null;
        return newHead;
    }
}
