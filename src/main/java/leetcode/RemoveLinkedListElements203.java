package leetcode;

/**
 * 思路1：定义虚拟头节点为头节点的前驱指针，从虚拟头节点出发，如果下个节点的值等于要删除的数，使当前节点next指向下个节点的next，否则节点向后移动
 * */
public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode virtualHead = new ListNode(-1, head);
        ListNode p = virtualHead;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return virtualHead.next;
    }
}
