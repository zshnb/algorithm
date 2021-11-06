package leetcode;

import java.util.ArrayDeque;

/**
 * 用/分割路径，得到目录数组，用栈记录目录，遇到空或者.不管，遇到字符串入栈，遇到..出栈，最后把栈种字符串拼接返回
 * */
public class SimplifyPath71 {
    public String simplifyPath(String path) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String s : path.split("/")) {
            if (s.equals("..")) {
                if (!queue.isEmpty()) {
                    queue.pop();
                }
            } else if (s.equals(".") || s.isEmpty()) {

            } else {
                queue.push(s);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("/");
        while (!queue.isEmpty()) {
            stringBuilder.append(queue.pollLast());
            if (queue.size() >= 1) {
                stringBuilder.append("/");
            }
        }
        return stringBuilder.toString();
    }
}
