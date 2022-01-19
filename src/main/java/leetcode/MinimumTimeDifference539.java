package leetcode;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 思路1：排序后两两时间相减由于0点可能是前一天或者后一天，因此取2边差值小的1个
 * */
public class MinimumTimeDifference539 {
    public int findMinDifference(List<String> timePoints) {
        timePoints = timePoints.stream().map(it -> {
            if (it.startsWith("00:")) {
                return it.replace("00:", "24:");
            } else {
                return it;
            }
        }).sorted().collect(Collectors.toList());
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < timePoints.size(); i++) {
            int minute = calcMinute(timePoints.get(i - 1), timePoints.get(i));
            min = Math.min(min, minute);
        }
        int minute = calcMinute(timePoints.get(0), timePoints.get(timePoints.size() - 1));
        min = Math.min(min, minute);
        return min;
    }

    public int findMinDifference2(List<String> timePoints) {
        timePoints = timePoints.stream().map(it -> {
            if (it.startsWith("00:")) {
                return it.replace("00:", "24:");
            } else {
                return it;
            }
        }).collect(Collectors.toList());
        int min = Integer.MAX_VALUE;
        int[] minutes = new int[timePoints.size()];
        int index = 0;
        for (int i = 1; i < timePoints.size(); i++) {
            int minute = calcMinute(timePoints.get(i - 1), timePoints.get(i));
            minutes[index] = minute;
            index += 1;
        }
        int minute = calcMinute(timePoints.get(0), timePoints.get(timePoints.size() - 1));
        minutes[index] = minute;
        for (int i : minutes) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private int calcMinute(String time1, String time2) {
        String[] strings1 = time1.split(":");
        String[] strings2 = time2.split(":");
        int minute = Integer.parseInt(strings2[1]) - Integer.parseInt(strings1[1]);
        int hour = Integer.parseInt(strings2[0]) - Integer.parseInt(strings1[0]);
        return Math.abs(Math.min(hour * 60 + minute, 1440 - (hour * 60 + minute)));
    }
}
