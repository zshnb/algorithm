package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoBinaryTrees617Test {
    @Test
    public void successful() {
        MergeTwoBinaryTrees617 obj = new MergeTwoBinaryTrees617();
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode result = obj.mergeTrees(root1, root2);
        Assertions.assertEquals(3, result.val);
    }
}
