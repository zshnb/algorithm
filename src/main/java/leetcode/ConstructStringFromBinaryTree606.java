package leetcode;

/**
 * 思路1：题意为去除非叶子节点的右空括号和叶子节点的子节点括号，通过递归添加字符，判断当前方向以及是否为叶子节点决定是否加括号
 * 思路2：题意可以理解为使用一对括号包裹左右子树的字符串，递归获取左子树和右子树的字符串，然后根据条件判断是否拼接括号
 * */
public class ConstructStringFromBinaryTree606 {
    public String tree2str(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        buildStr(root, 0, false, stringBuilder);
        String result = stringBuilder.toString();
        return result.substring(1, result.length() - 1);
    }

    public String tree2str2(TreeNode root) {
        if (root == null) {
            return "";
        }
        String left = tree2str2(root.left);
        String right = tree2str2(root.right);
        if (root.left == null && root.right == null) {
            return root.val + "";
        }
        if (root.right == null) {
            return String.format("%d(%s)", root.val, left);
        }
        return String.format("%d(%s)(%s)", root.val, left, right);
    }

    private void buildStr(TreeNode node, int direction, boolean leaf, StringBuilder stringBuilder) {
        if (node != null) {
            stringBuilder.append("(");
            stringBuilder.append(node.val);
        }
        if (node == null) {
            if (direction == 0 && !leaf) {
                stringBuilder.append("()");
            }
            return;
        }
        boolean l = node.left == null && node.right == null;
        buildStr(node.left, 0, l, stringBuilder);
        buildStr(node.right, 1, l, stringBuilder);
        stringBuilder.append(")");
    }
}
