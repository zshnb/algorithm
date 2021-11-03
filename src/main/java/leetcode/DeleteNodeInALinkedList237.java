package leetcode;

/**
 * 思路1：将当前节点的值设置为下个节点，然后删除下个节点
 * */
public class DeleteNodeInALinkedList237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
