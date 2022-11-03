package module12.lesson2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class HomeTask2 {
    public static void main(String[] args) throws InterruptedException {
        // збирає елементи для виводу на екран
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        MyProducer fizzProducer = new MyProducer() {
            int n;
            boolean updated = false;
            @Override
            public void setN(int n) {
                this.n = n;
                updated = true;
            }

            @Override
            public boolean isUpdated() {
                return updated;
            }


            @Override
            public void run() {
                while (true) {
                    try {
                        if(updated) {
                            updated = false;
                            if (n % 3 == 0) {
                                queue.put("fizz");
                            }
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        MyProducer numberProducer = new MyProducer() {
            int n;
            boolean updated = false;
            @Override
            public void setN(int n) {
                this.n = n;
                updated = true;
            }

            @Override
            public boolean isUpdated() {
                return updated;
            }


            @Override
            public void run() {
                while (true) {
                    try {
                        if(updated) {
                            updated = false;
                            if (n % 3 != 0) {
                                queue.put(String.valueOf(n));
                            }
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable consumer = () -> {
            while (true) {
                while (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(numberProducer);
        executor.execute(fizzProducer);
        executor.execute(consumer);
        for (int i = 1; i <= 20; i++) {
            fizzProducer.setN(i);
            numberProducer.setN(i);
            while (fizzProducer.isUpdated() || numberProducer.isUpdated()){
                Thread.sleep(100);
            }
        }
    }
}
