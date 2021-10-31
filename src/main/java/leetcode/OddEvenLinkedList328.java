package leetcode;

/**
 * 思路1：定义2个虚拟头节点，分别表示奇数链表和偶数链表，遍历原链表的过程中将节点按照条件拼在相应的链表后面，最后把链表串联<br>
 * 思路2：定义奇数链表头节点为原来的头节点，偶数链表头节点为原头节点的next，遍历的时候只需要将奇数链表尾节点next指向偶数链表尾节点next，
 * 同时更新奇数和偶数链表尾节点，直到没有下个节点，然后把奇数链表尾节点指向偶数链表头节点。
 * */
public class OddEvenLinkedList328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        int i = 1;
        ListNode oddHead = new ListNode(-1);
        ListNode oddCurr = oddHead;
        ListNode evenHead = new ListNode(-1);
        ListNode evenCurr = evenHead;
        ListNode p = head;
        while (p != null) {
            if (i % 2 != 0) {
                oddCurr.next = new ListNode(p.val);
                oddCurr = oddCurr.next;
            } else {
                evenCurr.next = new ListNode(p.val);
                evenCurr = evenCurr.next;
            }
            p = p.next;
            i++;
        }
        oddCurr.next = evenHead.next;
        return oddHead.next;
    }

    public ListNode oddEvenList2(ListNode head) {
        if (head == null) return null;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddCurr = oddHead;
        ListNode evenCurr = evenHead;
        while (oddCurr.next != null && evenCurr.next != null) {
            oddCurr.next = evenCurr.next;
            oddCurr = oddCurr.next;
            evenCurr.next = oddCurr.next;
            evenCurr = evenCurr.next;
        }
        oddCurr.next = evenHead;
        return oddHead;
    }
}
