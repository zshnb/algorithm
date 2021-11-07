package leetcode;

import java.util.*;

/**
 * 思路1：递归<br>
 * 思路2：使用栈保存左右节点，注意栈的特性要先放右边再放左边
 * */
public class BinaryTreePreorderTraversal144 {
    private List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null) return list;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            list.add(node.val);
            if (node.right != null) {
                queue.push(node.right);
            }
            if (node.left != null) {
                queue.push(node.left);
            }

        }
        return list;
    }

    void preOrder(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
