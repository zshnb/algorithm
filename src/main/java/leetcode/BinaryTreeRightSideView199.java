package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 思路1：递归，先进入👉节点，再进入左节点，同时记录当前层级，只有当层级>结果列表大小，也就是当前层还未添加节点时才加入节点值<br>
 * 思路2：使用队列，每一层需要判断到了最右边才将值放入结果列表
 * */
public class BinaryTreeRightSideView199 {
    List<Integer> result = new ArrayList<>();
    int depth = 0;
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return result;
        preOrder(root);
        return result;
    }

    public List<Integer> rightSideView2(TreeNode root) {
        if (root == null) return result;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.removeFirst();
                if (count == 1) {
                    result.add(node.val);
                }
                if (node.left != null) queue.addLast(node.left);
                if (node.right != null) queue.addLast(node.right);
                count -= 1;
            }
        }
        return result;
    }

    void preOrder(TreeNode node) {
        if (node == null) return;
        depth += 1;
        if (depth > result.size()) {
            result.add(node.val);
        }
        preOrder(node.right);
        preOrder(node.left);
        depth -= 1;
    }
}
