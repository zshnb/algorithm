package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedList234Test extends BaseTest {
    private PalindromeLinkedList234 instance = new PalindromeLinkedList234();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Assertions.assertTrue(instance.isPalindrome(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Assertions.assertTrue(instance.isPalindrome2(head));
    }
}
