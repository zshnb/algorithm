package leetcode;

/**
 * 思路1：正常数的递归，如果是叶子节点，返回对应bool，否则根据节点值执行左右子数的运算
 * */
public class EvaluateBooleanBinaryTree2331 {
    public boolean evaluateTree(TreeNode root) {
        return evaluate(root);
    }

    private boolean evaluate(TreeNode root) {
        if (root.left == null && root.right == null) {
            if (root.val == 0) {
                return false;
            } else {
                return true;
            }
        }
        int val = root.val;
        if (val == 2) {
            return evaluate(root.left) || evaluate(root.right);
        } else {
            return evaluate(root.left) && evaluate(root.right);
        }
    }
}
