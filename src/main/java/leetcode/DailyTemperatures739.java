package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 思路1：单调栈，从数组末尾开始遍历，找到每个元素后面第一个比它大的，如果栈顶元素比当前元素小，记录天数的值要加上栈顶元素的天数，直到遇到一个比当前元素大的，
 * 然后把当前元素和其对应下一个高温度天数入栈
 * */
public class DailyTemperatures739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Temperature> deque = new ArrayDeque<>();
        int day = 1;
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!deque.isEmpty() && deque.getFirst().value <= temperatures[i]) {
                Temperature temperature = deque.removeFirst();
                day += temperature.nextDay;
            }
            result[i] = deque.isEmpty() ? 0 : day;
            deque.addFirst(new Temperature(temperatures[i], result[i]));
            day = 1;
        }

        return result;
    }

    static class Temperature {
        int value;
        int nextDay;

        public Temperature(int value, int nextDay) {
            this.value = value;
            this.nextDay = nextDay;
        }
    }
}
