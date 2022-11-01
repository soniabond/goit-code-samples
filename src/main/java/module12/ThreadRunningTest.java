package module12;

import java.util.Scanner;

public class ThreadRunningTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RunningThread runningThread = new RunningThread();
        runningThread.start();
        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "exit": {
                    System.out.println("Exit!");
                    System.exit(1);
                } break;
                case "run": {
                    runningThread.setRunning(true);
                } break;
                case "pause": {
                    System.out.println("Pause!");
                    runningThread.setRunning(false);
                } break;
                case "stop": {
                    System.out.println("Stopped!");
                    runningThread.setAlive(false);
                }break;
            }
            System.out.println(Thread.currentThread().getName());
        }


    }

    public static class RunningThread extends Thread {
        private boolean running = false;
        private boolean isAlive = true;

        public boolean isRunning() {
            return running;
        }

        public void setRunning(boolean running) {
            this.running = running;
        }

        public void setAlive(boolean alive) {
            isAlive = alive;
        }

        @Override
        public void run() {
            while (isAlive) {
                if(running) {
                    System.out.println("Thread is running");
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
