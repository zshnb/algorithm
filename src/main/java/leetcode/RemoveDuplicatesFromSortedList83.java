package leetcode;

/**
 * 思路1：遍历链表的时候判断当前节点的值是否与下一个节点相同，如果是，将当前节点指向下下个节点
 * */
public class RemoveDuplicatesFromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        while (p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
