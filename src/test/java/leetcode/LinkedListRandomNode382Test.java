package leetcode;

import org.junit.jupiter.api.Test;

public class LinkedListRandomNode382Test {

    @Test
    public void test() {
        ListNode head = new ListNode(10, new ListNode(1, new ListNode(10, new ListNode(20, new ListNode(50)))));
        LinkedListRandomNode382 instance = new LinkedListRandomNode382(head);
        for (int i = 0;i < 100;i++) {
            System.out.println(instance.getRandom2());
        }
    }
}
