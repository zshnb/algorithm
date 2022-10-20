package leetcode;

/**
 * 思路1：暴力计算出当前行的字符序列，然后返回当前位置的字符
 * 思路2：序列有个规律，当前行的前半部分与上一行相同，同时k位置的字符在当前行序列前半部分与上一行相同，后半部分相反
 * */
public class KthSymbolGrammar779 {
    public int kthGrammar2(int n, int k) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return "01".charAt((k - 1) % 2) - '0';
        }
        StringBuilder target = new StringBuilder();
        StringBuilder source = new StringBuilder("0");
        int sourceIndex = 0;
        while (n > 1) {
            if (sourceIndex >= source.length()) {
                source = new StringBuilder(target);
                target = new StringBuilder();
                n -= 1;
                sourceIndex = 0;
            }
            if (n == 1) {
                break;
            }
            char ch = source.charAt(sourceIndex);
            if (ch == '0') {
                target.append("01");
            } else {
                target.append("10");
            }
            sourceIndex += 1;
        }
        return source.charAt(k - 1) - '0';
    }

    public int kthGrammar(int n, int k) {
        if (k == 1) return 0; // 向上遍历到了第1行，则返回结果
        if (k > (1 << n - 2)) return 1 ^ kthGrammar(n - 1, k - (1 << n - 2)); // 如果在“蓝色区间”，则与上一行值相反
        else return kthGrammar(n - 1, k); // 如果在“黄色区间”，则与上一行值相同
    }
}
