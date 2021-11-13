package leetcode;

/**
 * 思路1：递归求解sum-当前节点值在左子树或者右子树种
 * */
public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == targetSum;
        if (hasPathSum(root.left, targetSum - root.val)) {
            return true;
        }
        if (hasPathSum(root.right, targetSum - root.val)) {
            return true;
        }
        return false;
    }
}
