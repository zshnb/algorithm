package leetcode;

/**
 * 思路1：进制转换，先取余再除以基数，直到数为0，注意判断一下负数
 * */
public class BaseSeven504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder("");
        int n = Math.abs(num);
        while (n != 0) {
            stringBuilder.insert(0, n % 7);
            n /= 7;
        }
        if (num < 0) {
            stringBuilder.insert(0, "-");
        }
        return stringBuilder.toString();
    }
}
