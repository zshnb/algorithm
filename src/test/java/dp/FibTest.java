package dp;

import org.junit.jupiter.api.Test;

public class FibTest {
    @Test
    public void withRecursive() {
        Fib fib = new Fib();
        long start = System.currentTimeMillis();
        int result = fib.withRecursive(40);
        System.out.printf("result: %d, cost: %d", result, (System.currentTimeMillis() - start) / 1000);
    }

    @Test
    public void withMemory() {
        Fib fib = new Fib();
        long start = System.currentTimeMillis();
        int result = fib.withMemory(40, new int[51]);
        System.out.printf("result: %d, cost: %d", result, (System.currentTimeMillis() - start) / 1000);
    }

    @Test
    public void withDp() {
        Fib fib = new Fib();
        long start = System.currentTimeMillis();
        int result = fib.withDp(40);
        System.out.printf("result: %d, cost: %d", result, (System.currentTimeMillis() - start) / 1000);
    }
}
