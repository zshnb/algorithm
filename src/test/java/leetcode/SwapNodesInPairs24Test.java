package leetcode;

import org.junit.jupiter.api.Test;

public class SwapNodesInPairs24Test extends BaseTest {
    private SwapNodesInPairs24 instance = new SwapNodesInPairs24();

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        printLinkedList(instance.swapPairs(head));
    }
}
