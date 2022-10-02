package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapAdjacentInLrString770Test {
    @Test
    public void successful() {
        SwapAdjacentInLrString770 obj = new SwapAdjacentInLrString770();
        Assertions.assertTrue(obj.canTransform("XLXRRXXRXX", "LXXXXXXRRR"));
        Assertions.assertFalse(obj.canTransform("RXR", "XXR"));
        Assertions.assertTrue(obj.canTransform("RXXLRXRXL", "XRLXXRRLX"));
        Assertions.assertFalse(obj.canTransform("XLLR", "LXLX"));
        Assertions.assertFalse(obj.canTransform("RL", "LR"));
        Assertions.assertTrue(obj.canTransform("XXXLXXXXXX", "XXXLXXXXXX"));
        Assertions.assertFalse(obj.canTransform("RLX", "XLR"));
        Assertions.assertFalse(obj.canTransform("RXX", "RXL"));
        Assertions.assertFalse(obj.canTransform("XLLR", "LXLX"));
        Assertions.assertFalse(obj.canTransform("LLR", "RRL"));
    }
}
