package leetcode;

import java.util.List;
import org.junit.jupiter.api.Test;

public class PathSumII113Test {
    @Test
    public void successful() {
        PathSumII113 obj = new PathSumII113();
        TreeNode root = new TreeNode(5,
            new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
            new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
        List<List<Integer>> result = obj.pathSum(root, 22);
        printResult(result);

        obj.result.clear();
        result = obj.pathSum(new TreeNode(1, new TreeNode(2), null), 1);
        printResult(result);

        obj.result.clear();
        result = obj.pathSum(new TreeNode(1), 1);
        printResult(result);

        obj.result.clear();
        result = obj.pathSum(new TreeNode(-2, null, new TreeNode(-3)), -5);
        printResult(result);

        obj.result.clear();
        result = obj.pathSum(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, new TreeNode(5), null), null), null), null), 6);
        printResult(result);

        obj.result.clear();
        result = obj.pathSum(new TreeNode(1, new TreeNode(-2, new TreeNode(1, new TreeNode(-1), null), new TreeNode(3)),
            new TreeNode(-3, new TreeNode(-2), null)), 2);
        printResult(result);
    }

    private void printResult(List<List<Integer>> result) {
        for (List<Integer> list : result) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
