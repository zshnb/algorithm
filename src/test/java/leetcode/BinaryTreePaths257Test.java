package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257Test extends BaseTest {
    private BinaryTreePaths257 instance = new BinaryTreePaths257();

    @Test
    public void test() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> expect = new ArrayList<>()
        {{
            add("1->2->5");
            add("1->3");
        }};
        assertListEquals(expect, instance.binaryTreePaths(root));
    }
}
