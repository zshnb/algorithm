package leetcode;

import org.junit.jupiter.api.Test;

public class ReshapeTheMatrix566Test {
	@Test
	public void successful() {
		ReshapeTheMatrix566 reshapeTheMatrix566 = new ReshapeTheMatrix566();
		reshapeTheMatrix566.matrixReshape(new int[][]{{1,2}, {3,4}}, 2, 2);
		reshapeTheMatrix566.matrixReshape(new int[][]{{1,2}, {3,4}}, 1, 4);
		reshapeTheMatrix566.matrixReshape(new int[][]{{1,2}, {3,4}}, 2, 4);
	}

	@Test
	public void successful2() {
		ReshapeTheMatrix566 reshapeTheMatrix566 = new ReshapeTheMatrix566();
		reshapeTheMatrix566.matrixReshape2(new int[][]{{1,2}, {3,4}}, 2, 2);
		reshapeTheMatrix566.matrixReshape2(new int[][]{{1,2}, {3,4}}, 1, 4);
		reshapeTheMatrix566.matrixReshape2(new int[][]{{1,2}, {3,4}}, 2, 4);
	}
}
