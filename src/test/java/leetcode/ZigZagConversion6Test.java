package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigZagConversion6Test {
	private ZigZagConversion6 instance = new ZigZagConversion6();

	@Test
	public void test() {
		Assertions.assertEquals("AB", instance.convert("AB", 1));
		Assertions.assertEquals("PAHNAPLSIIGYIR", instance.convert("PAYPALISHIRING", 3));
	}
}
