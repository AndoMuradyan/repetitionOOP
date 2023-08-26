package am.itspace.lesson.threadExample.atomicExample;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterExample {

        public static void main(String[] args) {
            AtomicInteger counter = new AtomicInteger(0);

            // Create and start multiple threads
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 4; i++) {
                    counter.incrementAndGet(); // Increment the counter atomically
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 7; i++) {
                    counter.incrementAndGet(); // Increment the counter atomically
                }
            });

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Print the final value of the counter
            System.out.println("Final counter value: " + counter.get());
        }
    }



