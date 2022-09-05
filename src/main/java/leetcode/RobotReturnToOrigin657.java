package leetcode;

/**
 * 思路1：使用二维数组记录原点坐标，遍历moves字符串，根据每个字符计算出当前坐标，最后判断当前坐标是否为原点坐标
 * 思路2：统计4个方向的字符数量是否相等
 * */
public class RobotReturnToOrigin657 {
	public boolean judgeCircle(String moves) {
		int[] origin = new int[]{0,0};
		for (char c : moves.toCharArray()) {
			switch (c) {
				case 'U': {
					origin[1] += 1;
					break;
				}
				case 'D': {
					origin[1] -= 1;
					break;
				}
				case 'L': {
					origin[0] -= 1;
					break;
				}
				case 'R': {
					origin[0] += 1;
					break;
				}
			}
		}
		return origin[0] == 0 && origin[1] == 0;
	}
}
