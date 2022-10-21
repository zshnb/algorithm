package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 思路1：暴力遍历
 * 思路1：使用栈来存放价格和其对应最大连续天数，当新价格入栈时，判断栈顶元素价格，如果大于新价格，新价格入栈，天数为1，否则栈顶元素出栈，对应天数累加到
 * 当前价格天数，直到栈顶元素大于新价格，此时新价格入栈，同时设置天数
 * */
public class OnlineStockSpan901 {
    private List<Integer> prices;
    private Deque<Stock> stocks;
    public OnlineStockSpan901() {
        prices = new ArrayList<>();
        stocks = new ArrayDeque<>();
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

    public int next2(int price) {
        if (stocks.isEmpty()) {
            stocks.addFirst(new Stock(price, 1));
            return 1;
        }
        if (stocks.peekFirst().price > price) {
            stocks.addFirst(new Stock(price, 1));
            return 1;
        }
        int day = 1;
        while (!stocks.isEmpty() && stocks.peekFirst().price <= price) {
            day += stocks.pollFirst().day;
        }
        stocks.addFirst(new Stock(price, day));
        return day;
    }

    static class Stock {
        int price;
        int day;

        public Stock(int price, int day) {
            this.price = price;
            this.day = day;
        }
    }
}
