package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberStudentsUnableEatLunch1700Test {
    @Test
    public void successful() {
        NumberStudentsUnableEatLunch1700 obj = new NumberStudentsUnableEatLunch1700();
        Assertions.assertEquals(3, obj.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
        Assertions.assertEquals(0, obj.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
    }
}
