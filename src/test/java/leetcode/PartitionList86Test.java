package leetcode;

import org.junit.jupiter.api.Test;

public class PartitionList86Test extends BaseTest {
    private PartitionList86 instance = new PartitionList86();

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        printLinkedList(instance.partition(head, 3));
    }
}
