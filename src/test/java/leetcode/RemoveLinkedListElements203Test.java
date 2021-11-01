package leetcode;

import org.junit.jupiter.api.Test;

public class RemoveLinkedListElements203Test extends BaseTest {
    private RemoveLinkedListElements203 instance = new RemoveLinkedListElements203();

    @Test
    public void test() {
        ListNode head = new ListNode(7, new ListNode(7, new ListNode(7)));
        printLinkedList(instance.removeElements(head, 7));
        head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        printLinkedList(instance.removeElements(head, 6));
    }
}
