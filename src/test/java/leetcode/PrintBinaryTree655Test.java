package leetcode;

import org.junit.jupiter.api.Test;

public class PrintBinaryTree655Test {
    @Test
    public void successful() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), null);
        PrintBinaryTree655 printBinaryTree655 = new PrintBinaryTree655();
        printBinaryTree655.printTree(root1);
    }
}
