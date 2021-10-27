package leetcode;

import org.junit.jupiter.api.Test;

public class ReverseLinkedList92Test extends BaseTest {
    private ReverseLinkedList92 instance = new ReverseLinkedList92();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(head);
        printLinkedList(instance.reverseBetween(head, 2, 4));

        head = new ListNode(3, new ListNode(5));
        printLinkedList(head);
        printLinkedList(instance.reverseBetween(head, 1, 2));
    }
}
