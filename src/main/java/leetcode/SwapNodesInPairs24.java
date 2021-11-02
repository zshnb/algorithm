package leetcode;

/**
 * 思路1：通过4个指针互相交换
 * */
public class SwapNodesInPairs24 {
    public ListNode swapPairs(ListNode head) {
        ListNode virtualHead = new ListNode(-1, head);
        ListNode p = virtualHead;
        ListNode node1, node2, next;
        while (p.next != null && p.next.next != null) {
            node1 = p.next;
            node2 = node1.next;
            next = node2.next;
            node2.next = node1;
            node1.next = next;
            p.next = node2;
            p = node1;
        }
        return virtualHead.next;
    }
}
