package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 每次递归进入子树时拼接当前节点，直到叶子节点时将拼接后的结果放入列表
 * */
public class BinaryTreePaths257 {
    private List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return res;
        recursive(root, res, "");
        return res;
    }

    private void recursive(TreeNode node, List<String> res, String val) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            res.add(val + node.val);
            return;
        }
        recursive(node.left, res, val + node.val + "->");
        recursive(node.right, res, val + node.val + "->");
    }
}
