package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToInteger8Test {
	private StringToInteger8 instance = new StringToInteger8();

	@Test
	public void test() {
		Assertions.assertEquals(1, instance.myAtoi("+1"));
		Assertions.assertEquals(3, instance.myAtoi("3.14"));
		Assertions.assertEquals(0, instance.myAtoi("word91283472332"));
		Assertions.assertEquals(42, instance.myAtoi("42"));
		Assertions.assertEquals( -42, instance.myAtoi("    -42"));
		Assertions.assertEquals(4193, instance.myAtoi("4193 with words"));
		Assertions.assertEquals(-2147483648, instance.myAtoi("-91283472332"));
	}
}
