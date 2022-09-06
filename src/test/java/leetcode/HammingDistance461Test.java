package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingDistance461Test {
	@Test
	public void successful() {
		HammingDistance461 hammingDistance461 = new HammingDistance461();
		Assertions.assertEquals(2, hammingDistance461.hammingDistance(2, 4));
	}
}
