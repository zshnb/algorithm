package leetcode;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AverageOfLevelsInBinaryTree637Test {
    @Test
    public void successful() {
        AverageOfLevelsInBinaryTree637 obj = new AverageOfLevelsInBinaryTree637();
        List<Double> result = obj.averageOfLevels(new TreeNode(3,
            new TreeNode(9, null, null), new TreeNode(20,
            new TreeNode(15, null, null), new TreeNode(7, null, null))));
        Assertions.assertEquals(3, result.get(0));
    }

    @Test
    public void successful2() {
        AverageOfLevelsInBinaryTree637 obj = new AverageOfLevelsInBinaryTree637();
        List<Double> result = obj.averageOfLevels2(new TreeNode(3,
            new TreeNode(9, null, null), new TreeNode(20,
            new TreeNode(15, null, null), new TreeNode(7, null, null))));
        Assertions.assertEquals(3, result.get(0));
    }
}
