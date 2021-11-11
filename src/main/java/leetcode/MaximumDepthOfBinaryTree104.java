package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 思路1：递归获取左子树和右子树的高度，求最大值<br>
 * 思路2：使用队列记录层级，每次进入层级深度+1
 * */
public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);
        while (!deque.isEmpty()) {
            int count = deque.size();
            while (count > 0) {
                TreeNode treeNode = deque.removeFirst();
                if (treeNode.left != null) deque.addLast(treeNode.left);
                if (treeNode.right != null) deque.addLast(treeNode.right);
                count -= 1;
            }
            depth += 1;
        }
        return depth;
    }
}
