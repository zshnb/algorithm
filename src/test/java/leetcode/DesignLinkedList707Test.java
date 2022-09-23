package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignLinkedList707Test {
    @Test
    public void successful() {
        DesignLinkedList707 obj = new DesignLinkedList707();
        obj.addAtIndex(1, 0);
        Assertions.assertEquals(-1, obj.get(0));

        obj = new DesignLinkedList707();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        Assertions.assertEquals(2, obj.get(1));
        obj.deleteAtIndex(1);
        Assertions.assertEquals(3, obj.get(1));
        Assertions.assertEquals(-1, obj.get(3));
        obj.deleteAtIndex(3);
        obj.deleteAtIndex(0);
        Assertions.assertEquals(3, obj.get(0));
        obj.deleteAtIndex(0);
        Assertions.assertEquals(-1, obj.get(0));

        obj.addAtHead(2);
        Assertions.assertEquals(2, obj.get(0));
        obj.deleteAtIndex(1);
        obj.addAtHead(2);
        obj.addAtHead(7);
        obj.addAtHead(3);
        obj.addAtHead(2);
        obj.addAtHead(5);
        obj.addAtTail(5);
        Assertions.assertEquals(2, obj.get(5));
        obj.deleteAtIndex(6);
        obj.deleteAtIndex(4);
        Assertions.assertEquals(2, obj.get(4));


        obj = new DesignLinkedList707();
        obj.addAtTail(1);
        Assertions.assertEquals(1, obj.get(0));
        obj.addAtTail(2);
        obj.deleteAtIndex(1);
        Assertions.assertEquals(1, obj.get(0));

        obj = new DesignLinkedList707();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        Assertions.assertEquals(2, obj.get(1));
        obj.deleteAtIndex(1);
        Assertions.assertEquals(3, obj.get(1));
    }
}
