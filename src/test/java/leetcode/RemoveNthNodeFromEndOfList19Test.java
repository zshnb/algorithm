package leetcode;

import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfList19Test extends BaseTest {
    private RemoveNthNodeFromEndOfList19 instance = new RemoveNthNodeFromEndOfList19();

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        printLinkedList(instance.removeNthFromEnd(head, 1));
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(instance.removeNthFromEnd(head, 2));
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        printLinkedList(instance.removeNthFromEnd2(head, 1));
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(instance.removeNthFromEnd2(head, 2));
    }
}
