package module12.lesson2;

import java.util.concurrent.*;

public class HomeTask1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Runnable producer = new Runnable() {
            int currValue;
            @Override
            public void run() {
                try {
                    queue.put("notification #" + currValue);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                currValue++;
                System.out.println("currValue = " + currValue);
            }
        };

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                System.out.println("5 second passed....");
                while (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.scheduleAtFixedRate(consumer, 5, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(producer, 1, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        executor.shutdown();

    }
}
