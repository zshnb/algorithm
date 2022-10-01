package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：递归求解，判断当前节点值加上之前走过的路径之和与目标值，相等的话把当前路径加入结果，然后把当前节点移除，继续递归，当遍历完一个节点的左右
 * 子树后，同样把节点从路径中移除
 * */
public class PathSumII113 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        recursive(root, targetSum, 0, new ArrayList<>(), true);
        return result;
    }

    private void recursive(TreeNode treeNode, int targetSum, int currSum, List<Integer> path, boolean root) {
        if (treeNode == null) {
            return;
        }
        path.add(treeNode.val);
        if (currSum + treeNode.val == targetSum && ((treeNode.left == null && treeNode.right == null))) {
            result.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        recursive(treeNode.left, targetSum, currSum + treeNode.val, path, false);
        recursive(treeNode.right, targetSum, currSum + treeNode.val, path, false);
        path.remove(path.size() - 1);
    }
}
