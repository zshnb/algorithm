package leetcode;

/**
 * 思路1：循环链表数组，把每一条与最终结果链表合并
 * */
public class MergeKSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for (ListNode list : lists) {
            result = mergeTwoList(list, result);
        }
        return result;
    }

    private ListNode mergeTwoList(ListNode listNode1, ListNode listNode2) {
        ListNode result = new ListNode(-1);
        ListNode resultHead = result;
        ListNode head1 = listNode1;
        ListNode head2 = listNode2;

        while (head1 != null && head2 != null) {
            int value;
            if (head1.val < head2.val) {
                value = head1.val;
                head1 = head1.next;
            } else {
                value = head2.val;
                head2 = head2.next;
            }
            resultHead.next = new ListNode(value);
            resultHead = resultHead.next;
        }

        resultHead.next = head1 == null ? head2 : head1;

        result = result.next;
        return result;
    }
}
