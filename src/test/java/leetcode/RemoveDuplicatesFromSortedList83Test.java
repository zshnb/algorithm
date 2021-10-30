package leetcode;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedList83Test extends BaseTest {
    private RemoveDuplicatesFromSortedList83 instance = new RemoveDuplicatesFromSortedList83();

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        printLinkedList(instance.deleteDuplicates(head));
    }
}
