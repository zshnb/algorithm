package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 思路1：使用层序遍历的方法，记录当前层个数和下一层个数，在队列弹出时，判断当前层个数是否到0了（遍历时减少），到了把和除以当前层个数，然后进入
 * 下一层，把下一层个数赋值当前层个数
 * 思路2：前序递归遍历，使用Pair记录当前层的总和以及对应的节点个数，使用数组记录所有Pair，下标为当前层数
 * */
public class AverageOfLevelsInBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root == null) {
            return List.of(0.0);
        }
        List<Double> result = new ArrayList<>();
        double tempSum = 0.0;
        int nowLevelCount = 1;
        int tempCount = 0;
        int nextLevelCount = 0;
        deque.addFirst(root);
        while (!deque.isEmpty()) {
            TreeNode treeNode = deque.pop();
            tempCount += 1;
            tempSum += treeNode.val;
            nowLevelCount -= 1;
            if (treeNode.left != null) {
                deque.addLast(treeNode.left);
                nextLevelCount += 1;
            }
            if (treeNode.right != null) {
                deque.addLast(treeNode.right);
                nextLevelCount += 1;
            }
            if (nowLevelCount == 0) {
                nowLevelCount = nextLevelCount;
                nextLevelCount = 0;
                result.add(tempSum / tempCount);
                tempCount = 0;
                tempSum = 0.0;
            }
        }
        return result;
    }

    public List<Double> averageOfLevels2(TreeNode root) {
        List<Pair> sumWithCounts = new ArrayList<>();
        preOrder(root, 0, sumWithCounts);
        List<Double> result = new ArrayList<>();
        for (Pair sumWithCount : sumWithCounts) {
            result.add((sumWithCount.sum * 1.0 / sumWithCount.count));
        }
        return result;
    }

    private void preOrder(TreeNode treeNode, int depth, List<Pair> sumWithCounts) {
        if (treeNode == null) {
            return;
        }
        // 没有层级数据时初始化一个
        if (sumWithCounts.size() <= depth) {
            sumWithCounts.add(new Pair());
        }
        sumWithCounts.get(depth).sum += treeNode.val;
        sumWithCounts.get(depth).count += 1;
        preOrder(treeNode.left, depth + 1, sumWithCounts);
        preOrder(treeNode.right, depth + 1, sumWithCounts);
    }

    private static class Pair {
        long sum;
        int count;
    }
}
