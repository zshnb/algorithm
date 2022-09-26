package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructStringFromBinaryTree606Test {
    @Test
    public void successful() {
        ConstructStringFromBinaryTree606 obj = new ConstructStringFromBinaryTree606();
        Assertions.assertEquals("1(2(4))(3)", obj.tree2str(
            new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3))));
        Assertions.assertEquals("1(2()(4))(3)", obj.tree2str(
            new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3))));
    }

    @Test
    public void successful2() {
        ConstructStringFromBinaryTree606 obj = new ConstructStringFromBinaryTree606();
        Assertions.assertEquals("1(2(4))(3)", obj.tree2str2(
            new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3))));
        Assertions.assertEquals("1(2()(4))(3)", obj.tree2str2(
            new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3))));
    }
}
