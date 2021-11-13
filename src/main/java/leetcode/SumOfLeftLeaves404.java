package leetcode;

/**
 * 思路1：判断当前节点是叶子节点，同时是上一个节点的左子树时，才返回当前节点值，所以从根节点开始递归累计左子树和右子树的值
 * */
public class SumOfLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return getNum(root, false);
    }

    private int getNum(TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        if (node.left == null && node.right == null && isLeft) return node.val;
        return getNum(node.left, true) + getNum(node.right, false);
    }
}
