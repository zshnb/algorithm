package leetcode;

import org.junit.jupiter.api.Test;

public class RemoveLinkedListElements82Test extends BaseTest {
    private RemoveLinkedListElements82 instance = new RemoveLinkedListElements82();

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        printLinkedList(instance.deleteDuplicates(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(1));
        printLinkedList(instance.deleteDuplicates2(head));
        head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        printLinkedList(instance.deleteDuplicates2(head));
    }
}
