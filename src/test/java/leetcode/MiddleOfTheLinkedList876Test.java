package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiddleOfTheLinkedList876Test {
    @Test
    public void successful() {
        MiddleOfTheLinkedList876 obj = new MiddleOfTheLinkedList876();
        Assertions.assertEquals(3, obj.middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))).val);
        Assertions.assertEquals(4, obj.middleNode(
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))).val);
    }
}
