package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

/**
 * 思路1：用栈模拟匹配和移除
 * */
public class NumberStudentsUnableEatLunch1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> studentQueue = Arrays.stream(students).boxed().collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> sandwichQueue = Arrays.stream(sandwiches).boxed().collect(Collectors.toCollection(ArrayDeque::new));

        int result = 0;
        int loop = 0;
        while (true) {
            int student = studentQueue.peekFirst();
            int sandwich = sandwichQueue.peekFirst();
            if (student == sandwich) {
                studentQueue.pollFirst();
                sandwichQueue.pollFirst();
                loop = 0;
            } else {
                studentQueue.addLast(studentQueue.pollFirst());
                loop += 1;
            }
            if (loop == studentQueue.size()) {
                result = studentQueue.size();
                break;
            }
        }
        return result;
    }
}
