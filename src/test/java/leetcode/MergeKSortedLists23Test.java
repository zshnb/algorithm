package leetcode;

import org.junit.jupiter.api.Test;

public class MergeKSortedLists23Test {
    @Test
    public void successful() {
        MergeKSortedLists23 obj = new MergeKSortedLists23();
        ListNode node1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode node3 = new ListNode(2, new ListNode(6));
        obj.mergeKLists(new ListNode[]{node1, node2, node3});
    }
}
