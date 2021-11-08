package leetcode;

import java.util.*;

/**
 * 利用队列存放当前节点的左右节点，由于题目不是打印，而是返回数据，因此还要记录下节点所在的层级，使得同一层级的节点值放入同一个list
 * */
public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<Pair> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        queue.addLast(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair pair = queue.removeFirst();
            if (pair.right == result.size()) {
                result.add(new ArrayList<>());
            }
            result.get(pair.right).add(pair.left.val);
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

class Pair {
    TreeNode left;
    int right;

    public Pair(TreeNode left, int right) {
        this.left = left;
        this.right = right;
    }
}