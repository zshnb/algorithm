package leetcode;

/**
 * 思路1：把2个输入数通过异或计算，然后计算输出数1的数量，异或运算是当2个二进制数不一致时结果为1
 * */
public class HammingDistance461 {
	public int hammingDistance(int x, int y) {
		int result = x ^ y;
		int count = 0;
		while (result != 0) {
			int ret = result % 2;
			if (ret == 1) {
				count += 1;
			}
			result /= 2;
		}
		return count;
	}
}
