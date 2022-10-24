package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvaluateBooleanBinaryTree2331Test {
    @Test
    public void successful() {
        EvaluateBooleanBinaryTree2331 obj = new EvaluateBooleanBinaryTree2331();
        Assertions.assertTrue(obj.evaluateTree(new TreeNode(2, new TreeNode(1), new TreeNode(3, new TreeNode(0), new TreeNode(1)))));
    }
}
