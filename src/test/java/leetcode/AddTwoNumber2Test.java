package leetcode;

import org.junit.jupiter.api.Test;

public class AddTwoNumber2Test extends BaseTest {
    private AddTwoNumber2 instance = new AddTwoNumber2();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        printLinkedList(instance.addTwoNumbers(l1, l2));

        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        printLinkedList(instance.addTwoNumbers(l1, l2));
    }
}
