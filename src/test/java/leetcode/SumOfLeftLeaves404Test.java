package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfLeftLeaves404Test {
    private SumOfLeftLeaves404 instance = new SumOfLeftLeaves404();

    @Test
    public void test() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Assertions.assertEquals(24, instance.sumOfLeftLeaves(root));
    }
}
