package module12;

import java.util.ArrayList;
import java.util.List;

public class CounterTest {

    // можна замінити на поотокобезпечний AtomicLong
    private static volatile long counter = 0;
    private static synchronized void add() {
        counter = counter + 1;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    add();
                }
            }));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("counter = " + counter);

    }
}
