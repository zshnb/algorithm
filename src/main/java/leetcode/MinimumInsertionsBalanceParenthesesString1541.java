package leetcode;

/**
 * 思路1：计数法，当遇到左括号时，对右括号需求数+2，这时候判断需求数，如果是奇数，说明需要添加右括号，遇到左括号时需求数-1，如果需求数为-1，说明遇到多于的右括号了
 * 需要加一个左括号，结果+1，同时需求数=1
 * */
public class MinimumInsertionsBalanceParenthesesString1541 {
    public int minInsertions(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        int need = 0;
        for (char ch : chars) {
            if (ch == '(') {
                need += 2;
                if (need % 2 != 0) {
                    res += 1;
                    need -= 1;
                }
            }
            if (ch == ')') {
                need -= 1;
                if (need == -1) {
                    res += 1;
                    need = 1;
                }
            }
        }
        return res + need;
    }
}
