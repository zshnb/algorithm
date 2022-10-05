package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBinaryTree110Test {
    @Test
    public void successful() {
        BalancedBinaryTree110 obj = new BalancedBinaryTree110();
        Assertions.assertTrue(obj.isBalanced(new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)))));
        Assertions.assertFalse(obj.isBalanced(new TreeNode(1,
            new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
            new TreeNode(2))));
    }

    @Test
    public void successful2() {
        BalancedBinaryTree110 obj = new BalancedBinaryTree110();
        Assertions.assertTrue(obj.isBalanced2(new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)))));
        Assertions.assertFalse(obj.isBalanced2(new TreeNode(1,
            new TreeNode(2, new TreeNode(3, new TreeNode(4), null), new TreeNode(3)),
            new TreeNode(2, null, new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8)))))));
        Assertions.assertFalse(obj.isBalanced2(new TreeNode(1,
            new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
            new TreeNode(2))));
    }
}
