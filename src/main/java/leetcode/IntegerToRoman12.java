package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路：把所有数字与符号的关系定义好后，从最大的符号开始，如果当前数字与当前符号对应的数字可以取余数（余数结果不为自己）
 * 把符号加入结果，然后当前数字减去符号对应数字后继续上一步，如果当前符号无法取余数则换下一个符号，直到结束
 * */
public class IntegerToRoman12 {
    static class Data {
        int value;
        String string;
        public Data(int value, String string) {
            this.value = value;
            this.string = string;
        }
    }

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder("");
        List<Data> list = new ArrayList<>() {{
            add(new Data(1, "I"));
            add(new Data(4, "IV"));
            add(new Data(5, "V"));
            add(new Data(9, "IX"));
            add(new Data(10, "X"));
            add(new Data(40, "XL"));
            add(new Data(50, "L"));
            add(new Data(90, "XC"));
            add(new Data(100, "C"));
            add(new Data(400, "CD"));
            add(new Data(500, "D"));
            add(new Data(900, "CM"));
            add(new Data(1000, "M"));
        }};
        for (int i = list.size() - 1; i >= 0; i--) {
            while (num % list.get(i).value != num) {
                result.append(list.get(i).string);
                num = num - list.get(i).value;
            }
        }
        return result.toString();
    }
}
