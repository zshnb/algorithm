package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯，可选路径是一对括号，简枝条件是单个括号数量不能超过n，当左括号<=有括号时不进行右括号的递归
 * */
public class GenerateParentheses22 {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		String[] strings = new String[] {"(", ")"};
		recursive(result, strings, "", n, 0, 0);
		return result;
	}

	private void recursive(List<String> result, String[] strings, String path, int n, int leftCount, int rightCount) {
		if (path.length() == n * 2 && leftCount <= n && rightCount <= n) {
			result.add(path);
			return;
		} else if (leftCount > n || rightCount > n) {
			return;
		}
		recursive(result, strings, path + strings[0], n, leftCount + 1, rightCount);
		if (leftCount > rightCount) {
			recursive(result, strings, path + strings[1], n, leftCount, rightCount + 1);
		}
	}
}
