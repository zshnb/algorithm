package heap;

import org.junit.jupiter.api.Test;

public class MinHeapTest {
    private MinHeap minHeap;

    @Test
    public void test() {
        minHeap = new MinHeap(new int[]{1, 3, 5, 4, 9, 6, 14});
        minHeap.add(12);
        minHeap.add(13);
        minHeap.add(6);
        minHeap.print();

        int min = minHeap.removeTop();
        System.out.println(min);
        minHeap.print();
    }
}
