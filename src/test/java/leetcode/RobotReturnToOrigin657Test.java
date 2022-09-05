package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotReturnToOrigin657Test {
	@Test
	public void successful() {
		RobotReturnToOrigin657 robotReturnToOrigin657 = new RobotReturnToOrigin657();
		Assertions.assertTrue(robotReturnToOrigin657.judgeCircle("UD"));
		Assertions.assertFalse(robotReturnToOrigin657.judgeCircle("LL"));
	}
}
