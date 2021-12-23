package leetcode;

/**
 * 思路1：使用freq数组记录原数组每个数字出现个数，然后从后往前遍历freq数组，对于每个出现次数大于1的数字，往前面找比当前数字小的，然后在结果次数上
 * 加上当前数字出现的频率，且把比当前数字小的数字频率也加上当前数字出现的频率，直到末尾。这里有个优化的点，在每次找到比当前数字小的数字后，可以把外层扫描
 * 下标直接定位到比当前数字小的数字下标处。
 * */
public class ReductionOperationsToMakeTheArrayElementsEqual1887 {
	public int reductionOperations(int[] nums) {
		int[] freq = new int[50000];
		int res = 0;
		for (int num : nums) {
			freq[num] += 1;
		}
		int i = freq.length - 1;
		for (; i >= 0; i--) {
			if (freq[i] != 0) {
				for (int j = i - 1; j >=0 ; j--) {
					if (freq[j] != 0) {
						res += freq[i];
						freq[j] += freq[i];
						i = j + 1;
						break;
					}
				}
			}
		}
		return res;
	}
}
