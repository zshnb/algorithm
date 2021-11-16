package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTree100Test {
    private SameTree100 instance = new SameTree100();

    @Test
    public void test1() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assertions.assertTrue(instance.isSameTree(root1, root2));
        Assertions.assertFalse(instance.isSameTree(new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(2))));
    }
}
