package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：首先递归计算出树的高度，然后通过二分的思路把节点的值设置进矩阵，从根节点开始，其左子树的值是放在第二行左半边的中间位置，右子树放在右半边
 * 的中间位置，就这样递归放置
 * */
public class PrintBinaryTree655 {
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        int weight = (int) (Math.pow(2, height) - 1);
        List<List<String>> result = new ArrayList<>(height);
        for (int i = 0; i < height; i++) {
            List<String> strings = new ArrayList<>(weight);
            for (int j = 0; j < weight; j++) {
                strings.add("");
            }
            result.add(strings);
        }

        fill(root, result, 0, 0, weight - 1);
        return result;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    private void fill(TreeNode treeNode, List<List<String>> result, int height, int left, int right) {
        if (treeNode == null) {
            return;
        }
        int mid = (left + right) / 2;
        result.get(height).set(mid, treeNode.val + "");
        fill(treeNode.left, result, height + 1, left, mid - 1);
        fill(treeNode.right, result, height + 1, mid + 1, right);
    }
}
