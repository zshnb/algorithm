package leetcode;

import org.junit.jupiter.api.Test;

public class RotateList61Test extends BaseTest {
    private RotateList61 instance = new RotateList61();

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2));
        printLinkedList(instance.rotateRight(head, 2));
        printLinkedList(instance.rotateRight(head, 1));
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(instance.rotateRight(head, 2));
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(instance.rotateRight(head, 10));
        head = new ListNode(1);
        printLinkedList(instance.rotateRight(head, 99));
        head = new ListNode(1, new ListNode(2));
    }
}
