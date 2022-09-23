package leetcode;

/**
 * 思路1：单节点链表模拟
 * */
public class DesignLinkedList707 {
    private ListNode head;
    private int length;
    public DesignLinkedList707() {
        head = new ListNode(-1);
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        ListNode tempHead = head;
        for (int i = 0; i <= index; i++) {
            tempHead = tempHead.next;
        }
        return tempHead.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(length, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        length += 1;
        int count = 0;
        ListNode tempHead = head;
        while (tempHead != null) {
            if (index == count) {
                ListNode newNode = new ListNode(val);
                newNode.next = tempHead.next;
                tempHead.next = newNode;
                return;
            }
            tempHead = tempHead.next;
            count += 1;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }
        if (index == 0) {
            length -= 1;
            head = head.next;
            return;
        }

        ListNode tempHead = head;
        for (int i = 0; i < index; i++) {
            tempHead = tempHead.next;
        }
        tempHead.next = tempHead.next.next;
        length -= 1;
    }
}
