package leetcode;

import org.junit.jupiter.api.Test;

public class DeleteNodeInALinkedList237Test extends BaseTest {
    private DeleteNodeInALinkedList237 instance = new DeleteNodeInALinkedList237();

    @Test
    public void test() {
        ListNode head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        instance.deleteNode(head.next);
        printLinkedList(head);
    }
}
