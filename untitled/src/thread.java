// Day 5 - 4

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// ============================================================
// ALL JAVA THREAD PROGRAMS - SINGLE FILE
// File name: AllThreadPrograms.java
// ============================================================

public class thread{

    // ----------------------------------------------------------
    // 1. Thread using Thread class
    // ----------------------------------------------------------
    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        getName() + " : " + i
                );
            }
        }
    }

    // ----------------------------------------------------------
    // 2. Thread using Runnable
    // ----------------------------------------------------------
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " : " + i
                );
            }
        }
    }

    // ----------------------------------------------------------
    // 3. Synchronization example
    // ----------------------------------------------------------
    static class Counter {

        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    // ----------------------------------------------------------
    // 4. Shared data for Producer-Consumer
    // ----------------------------------------------------------
    static class SharedData {

        private int value;
        private boolean available = false;

        public synchronized void produce(int value)
                throws InterruptedException {

            while (available) {
                wait();
            }

            this.value = value;
            available = true;

            System.out.println("Produced: " + value);

            notify();
        }

        public synchronized void consume()
                throws InterruptedException {

            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + value);

            available = false;

            notify();
        }
    }

    // ----------------------------------------------------------
    // Main method
    // ----------------------------------------------------------
    public static void main(String[] args) throws Exception {

        System.out.println("======================================");
        System.out.println(" JAVA MULTITHREADING PROGRAMS");
        System.out.println("======================================");

        // ======================================================
        // 1. Creating thread using Thread class
        // ======================================================

        System.out.println("\n1. Thread using Thread class");

        MyThread t1 = new MyThread("Thread-1");

        t1.start();

        t1.join();

        // ======================================================
        // 2. Creating thread using Runnable
        // ======================================================

        System.out.println("\n2. Thread using Runnable");

        Thread t2 = new Thread(
                new MyRunnable(),
                "Runnable-Thread"
        );

        t2.start();

        t2.join();

        // ======================================================
        // 3. Multiple threads
        // ======================================================

        System.out.println("\n3. Multiple Threads");

        MyThread t3 = new MyThread("Thread-3");
        MyThread t4 = new MyThread("Thread-4");

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        // ======================================================
        // 4. sleep() method
        // ======================================================

        System.out.println("\n4. sleep() Method");

        Thread sleepThread = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        "Sleeping Thread: " + i
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        });

        sleepThread.start();
        sleepThread.join();

        // ======================================================
        // 5. join() method
        // ======================================================

        System.out.println("\n5. join() Method");

        Thread joinThread = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        "Join Thread: " + i
                );
            }

        });

        joinThread.start();

        // Main waits until joinThread finishes
        joinThread.join();

        System.out.println("Main thread continues.");

        // ======================================================
        // 6. Thread Name
        // ======================================================

        System.out.println("\n6. Thread Name");

        Thread nameThread = new Thread(() -> {

            System.out.println(
                    "Current Thread Name: "
                            + Thread.currentThread().getName()
            );

        });

        nameThread.setName("My-Custom-Thread");

        nameThread.start();
        nameThread.join();

        // ======================================================
        // 7. Thread Priority
        // ======================================================

        System.out.println("\n7. Thread Priority");

        Thread low = new Thread(() -> {
            System.out.println(
                    "Low Priority Thread"
            );
        });

        Thread normal = new Thread(() -> {
            System.out.println(
                    "Normal Priority Thread"
            );
        });

        Thread high = new Thread(() -> {
            System.out.println(
                    "High Priority Thread"
            );
        });

        low.setPriority(Thread.MIN_PRIORITY);     // 1
        normal.setPriority(Thread.NORM_PRIORITY); // 5
        high.setPriority(Thread.MAX_PRIORITY);    // 10

        low.start();
        normal.start();
        high.start();

        low.join();
        normal.join();
        high.join();

        // ======================================================
        // 8. isAlive() method
        // ======================================================

        System.out.println("\n8. isAlive() Method");

        Thread aliveThread = new Thread(() -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        });

        System.out.println(
                "Before start: " + aliveThread.isAlive()
        );

        aliveThread.start();

        System.out.println(
                "After start: " + aliveThread.isAlive()
        );

        aliveThread.join();

        System.out.println(
                "After completion: " + aliveThread.isAlive()
        );

        // ======================================================
        // 9. Synchronization
        // ======================================================

        System.out.println("\n9. Synchronization");

        Counter counter = new Counter();

        Thread counterThread1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        });

        Thread counterThread2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        });

        counterThread1.start();
        counterThread2.start();

        counterThread1.join();
        counterThread2.join();

        System.out.println(
                "Final Count: " + counter.getCount()
        );

        // ======================================================
        // 10. Producer-Consumer
        // ======================================================

        System.out.println("\n10. Producer-Consumer");

        SharedData data = new SharedData();

        Thread producer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                try {
                    data.produce(i);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

            }

        });

        Thread consumer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                try {
                    data.consume();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

            }

        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        // ======================================================
        // 11. Daemon Thread
        // ======================================================

        System.out.println("\n11. Daemon Thread");

        Thread daemonThread = new Thread(() -> {

            while (true) {

                System.out.println(
                        "Daemon thread is running..."
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }

        });

        daemonThread.setDaemon(true);

        daemonThread.start();

        Thread.sleep(1500);

        System.out.println(
                "Main thread finished Daemon example."
        );

        // ======================================================
        // 12. ExecutorService
        // ======================================================

        System.out.println("\n12. ExecutorService");

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {

            final int task = i;

            executor.execute(() -> {

                System.out.println(
                        "Task " + task
                                + " executed by "
                                + Thread.currentThread().getName()
                );

            });
        }

        executor.shutdown();

        // Wait until executor tasks finish
        while (!executor.isTerminated()) {
            Thread.sleep(100);
        }

        // ======================================================
        // 13. Callable and Future
        // ======================================================

        System.out.println("\n13. Callable and Future");

        ExecutorService service =
                Executors.newSingleThreadExecutor();

        Callable<Integer> callableTask = () -> {

            int a = 10;
            int b = 20;

            return a + b;
        };

        Future<Integer> future =
                service.submit(callableTask);

        System.out.println(
                "Callable Result: " + future.get()
        );

        service.shutdown();

        // ======================================================
        // 14. Thread interruption
        // ======================================================

        System.out.println("\n14. Thread Interruption");

        Thread interruptThread = new Thread(() -> {

            try {

                for (int i = 1; i <= 10; i++) {

                    System.out.println(
                            "Working: " + i
                    );

                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {

                System.out.println(
                        "Thread was interrupted."
                );
            }
        });

        interruptThread.start();

        Thread.sleep(1200);

        interruptThread.interrupt();

        interruptThread.join();

        // ======================================================
        // 15. Thread information
        // ======================================================

        System.out.println("\n15. Thread Information");

        Thread current =
                Thread.currentThread();

        System.out.println(
                "Thread Name: " + current.getName()
        );

        System.out.println(
                "Thread ID: " + current.getId()
        );

        System.out.println(
                "Thread Priority: "
                        + current.getPriority()
        );

        System.out.println(
                "Thread State: "
                        + current.getState()
        );

        System.out.println(
                "Is Alive: "
                        + current.isAlive()
        );

        // ======================================================
        // End
        // ======================================================

        System.out.println("\n======================================");
        System.out.println(" ALL PROGRAMS COMPLETED");
        System.out.println("======================================");
    }
}
