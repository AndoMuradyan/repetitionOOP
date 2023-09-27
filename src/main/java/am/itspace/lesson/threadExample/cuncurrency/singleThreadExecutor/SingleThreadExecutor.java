package am.itspace.lesson.threadExample.cuncurrency.singleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

    public static void main(String[] args) {

        System.out.println("Start of main thread ");
        Runnable task1 = () -> {
            System.out.println("Task 1: Simple Print");
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task2: i = " + i);
            }
        };

        ExecutorService e = null;
        try {
            e = Executors.newSingleThreadExecutor();
            e.execute(task1);
            e.execute(task2);
            e.execute(task1);
        } finally {
            if (e != null) {
                e.shutdown();
            }
        }
        System.out.println("End if main thread");
    }
}
