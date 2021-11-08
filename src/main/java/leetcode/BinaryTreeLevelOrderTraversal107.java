package leetcode;

import java.util.*;

/**
 * 返回结果为栈，将先遇到的加到后面
 * */
public class BinaryTreeLevelOrderTraversal107 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<Pair> queue = new ArrayDeque<>();
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        queue.addLast(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair pair = queue.removeFirst();
            if (pair.right == result.size()) {
                result.addFirst(new ArrayList<>());
            }
            result.getFirst().add(pair.left.val);
            if (pair.left.left != null) {
                queue.addLast(new Pair(pair.left.left, pair.right + 1));
            }
            if (pair.left.right != null) {
                queue.addLast(new Pair(pair.left.right, pair.right + 1));
            }
        }
        return result;
    }
}
