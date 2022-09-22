package leetcode;

/**
 * 思路1：递归2颗树，每次递归中得出结果数的节点，最后返回
 * */
public class MergeTwoBinaryTrees617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = mergeTrees(root1.left, root2.left);
        node.right = mergeTrees(root1.right, root2.right);
        return node;
    }

}
