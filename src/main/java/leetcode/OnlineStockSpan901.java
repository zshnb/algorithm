package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 思路1：暴力遍历
 * */
public class OnlineStockSpan901 {
    private List<Integer> prices;
    public OnlineStockSpan901() {
        prices = new ArrayList<>();
    }

    public int next(int price) {
        int result = 0;
        prices.add(price);
        int lastIndex = prices.size() - 1;
        for (int i = lastIndex; i >= 0; i--) {
            if (prices.get(i) <= price) {
                result += 1;
            } else {
                break;
            }
        }
        return result;
    }
}
