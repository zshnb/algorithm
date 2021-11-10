package heap;

import util.SwapUtil;

public class MinHeap {
    private int[] array;
    private int length;

    public MinHeap(int capacity) {
        array = new int[capacity];
        length = 0;
    }

    public MinHeap(int[] array) {
        this(100);
        System.arraycopy(array, 0, this.array, 1, array.length);
        length = array.length;
    }

    public void add(int num) {
        up(num);
    }

    public int removeTop() {
        return down();
    }

    private void up(int num) {
        length += 1;
        array[length] = num;
        int i = length;
        while (i > 1 && array[i] < array[i / 2]) {
            SwapUtil.swap(array, i, i / 2);
            i /= 2;
        }
    }

    private int down() {
        int result = array[1];
        array[1] = array[length];
        array[length] = 0;
        length -= 1;
        int i = 1;
        int maxIndex = 0;
        while (i < length) {
            int child = i * 2;
            if (array[i] < array[child] && array[i] < array[child + 1])
                break;
            if (array[i] > array[child]) {
                maxIndex = child;
            }
            if (array[child] > array[child + 1]) {
                maxIndex = child + 1;
            }
            SwapUtil.swap(array, i, maxIndex);
            i = maxIndex;
        }
        return result;
    }

    public void print() {
        for (int i : array) {
            if (i != 0)
                System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
