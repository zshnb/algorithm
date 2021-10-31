package leetcode;

import org.junit.jupiter.api.Test;

public class OddEvenLinkedList328Test extends BaseTest {
    private OddEvenLinkedList328 instance = new OddEvenLinkedList328();

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(instance.oddEvenList(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(instance.oddEvenList2(head));
    }
}
