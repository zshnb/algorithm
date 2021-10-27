package leetcode;

/**
 * 思路1：反转链表的过程实际上就是从反转点开始，把下一个节点插入到反转点与反转点前驱节点中间，插入完成后反转点的节点会向后移动一格，因此在反转过程中
 * 只需要不停将反转节点的下一个节点插入到反转点与反转点前驱节点中间即可
 * */
public class ReverseLinkedList92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        ListNode prev = virtualHead, curr;
        int i = 1;
        while (i < left) {
            prev = prev.next;
            i++;
        }

        curr = prev.next;
        i = left;
        while (i < right) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            i++;
        }
        return virtualHead.next;
    }
}
