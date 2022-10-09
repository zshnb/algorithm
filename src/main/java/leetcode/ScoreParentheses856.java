package leetcode;

/**
 * 解法1：分治，字符串可以分割成嵌套和前后2个相加的形式，分割点可以通过遍历字符串，遇到( +1，遇到) -1，如果到0了，说明遇到分割点了，此时判断当前循环中
 * 累加的字符串长度是否等于字符串本身长度，相等的话为嵌套形式
 * */
public class ScoreParentheses856 {
    public int scoreOfParentheses(String s) {
        if (s.length() == 2) {
            return 1;
        }
        int bal = 0, n = s.length(), len = 0;
        for (int i = 0; i < n; i++) {
            bal += (s.charAt(i) == '(' ? 1 : -1);
            if (bal == 0) {
                len = i + 1;
                break;
            }
        }
        if (len == n) {
            return 2 * scoreOfParentheses(s.substring(1, n - 1));
        } else {
            return scoreOfParentheses(s.substring(0, len)) + scoreOfParentheses(s.substring(len));
        }
    }
}
