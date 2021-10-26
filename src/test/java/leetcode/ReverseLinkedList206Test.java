package leetcode;

import org.junit.jupiter.api.Test;

public class ReverseLinkedList206Test extends BaseTest {
    private ReverseLinkedList206 instance = new ReverseLinkedList206();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(head);
        printLinkedList(instance.reverseList1(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(head);
        printLinkedList(instance.reverseList2(head));
    }
}
