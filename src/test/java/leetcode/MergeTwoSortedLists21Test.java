package leetcode;

import org.junit.jupiter.api.Test;

public class MergeTwoSortedLists21Test extends BaseTest {
    private MergeTwoSortedLists21 instance = new MergeTwoSortedLists21();

    @Test
    public void test() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        printLinkedList(instance.mergeTwoLists(l1, l2));
    }
}
