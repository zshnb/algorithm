package leetcode;

/**
 * 思路1：遍历一次算出长度后，遍历length / 2个位置
 * 思路2：快慢指针
 * */
public class MiddleOfTheLinkedList876 {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length += 1;
            temp = temp.next;
        }
        int middle = length / 2;
        for (;middle > 0;middle--) {
            head = head.next;
        }
        return head;
    }

    public ListNode middleNode2(ListNode head) {
        // 快慢指针初始化指向 head
        ListNode slow = head, fast = head;
        // 快指针走到末尾时停止
        while (fast != null && fast.next != null) {
            // 慢指针走一步，快指针走两步
            slow = slow.next;
            fast = fast.next.next;
        }
        // 慢指针指向中点
        return slow;
    }
}
