package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycle141Test {
    @Test
    public void successful() {
        LinkedListCycle141 obj = new LinkedListCycle141();
        ListNode head = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(0);
        ListNode four = new ListNode(-4);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = two;
        Assertions.assertTrue(obj.hasCycle(head));
    }

    @Test
    public void successful2() {
        LinkedListCycle141 obj = new LinkedListCycle141();
        ListNode head1 = new ListNode(1, new ListNode(2));
        Assertions.assertFalse(obj.hasCycle2(head1));

        ListNode head = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(0);
        ListNode four = new ListNode(-4);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = two;
        Assertions.assertTrue(obj.hasCycle2(head));

    }
}
