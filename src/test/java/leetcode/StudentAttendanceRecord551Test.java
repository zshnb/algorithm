package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentAttendanceRecord551Test {
    @Test
    public void successful() {
        StudentAttendanceRecord551 obj = new StudentAttendanceRecord551();
        Assertions.assertTrue(obj.checkRecord("LALL"));
        Assertions.assertTrue(obj.checkRecord("PPALLP"));
        Assertions.assertFalse(obj.checkRecord("PPALLL"));
    }
}
