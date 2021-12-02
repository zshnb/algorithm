package leetcode;

public class Str28 {
	public int strStr(String haystack, String needle) {
		if (needle.isEmpty() && haystack.isEmpty()) return 0;
		if (needle.isEmpty()) return 0;
		return haystack.indexOf(needle);
	}
}
