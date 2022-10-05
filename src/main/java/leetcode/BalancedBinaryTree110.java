package leetcode;

/**
 * 思路1：先求解左右子树的高度，然后判断左右子树是否平衡，最后递归左子树和右子树
 * 思路2：在遍历求高度的过程中顺便判断是否平衡，如果不平衡标记额外变量，最后返回额外变量，这样只需要遍历一次
 * */
public class BalancedBinaryTree110 {
    private boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recursive(root);
    }

    private boolean recursive(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1) {
            return recursive(root.left) && recursive(root.right);
        }
        return false;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced2(TreeNode root) {
        if (root == null) {
            return true;
        }
        recursive2(root);
        return isBalanced;
    }

    private int recursive2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = recursive2(root.left);
        int rightHeight = recursive2(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            isBalanced = false;
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
