package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTree104Test {
    private MaximumDepthOfBinaryTree104 instance = new MaximumDepthOfBinaryTree104();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        Assertions.assertEquals(3, instance.maxDepth(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        Assertions.assertEquals(3, instance.maxDepth2(root));
    }
}
