package leetcode;

/**
 * 思路1：使用字符串的contains方法
 * 思路1：循环s1，比较s1当前索引前半部分和s2当前索引后半部分，s1当前索引后半部分和s2当前索引前半部分是否相等
 * */
public class StringRotationLcci1_9 {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int i = 1;
        while (i <= s1.length()) {
            if (s1.substring(0, i).equals(s2.substring(s2.length() - i)) &&
                s1.substring(i).equals(s2.substring(0, s2.length() - i))
            ) {
                return true;
            }
            i += 1;
        }
        return false;
    }
}
