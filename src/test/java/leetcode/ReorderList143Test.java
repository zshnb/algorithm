package leetcode;

import org.junit.jupiter.api.Test;

public class ReorderList143Test extends BaseTest {
    private ReorderList143 instance = new ReorderList143();

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        instance.reorderList(head);
        printLinkedList(head);
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        instance.reorderList(head);
        printLinkedList(head);
    }
}
