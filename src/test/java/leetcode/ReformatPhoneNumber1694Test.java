package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReformatPhoneNumber1694Test {
    @Test
    public void successful() {
        ReformatPhoneNumber1694 obj = new ReformatPhoneNumber1694();
        Assertions.assertEquals("123-45-67", obj.reformatNumber("123 4-567"));
        Assertions.assertEquals("123-456", obj.reformatNumber("1-23-45 6"));
        Assertions.assertEquals("123-456-78", obj.reformatNumber("123 4-5678"));
    }

    @Test
    public void successful2() {
        ReformatPhoneNumber1694 obj = new ReformatPhoneNumber1694();
        Assertions.assertEquals("123-456-78", obj.reformatNumber2("123 4-5678"));
        Assertions.assertEquals("123-45-67", obj.reformatNumber2("123 4-567"));
        Assertions.assertEquals("123-456", obj.reformatNumber2("1-23-45 6"));
    }
}
