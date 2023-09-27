package am.itspace.lesson.threadExample.cuncurrency.polling;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;

public class CheckResult {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            for (int i = 0; i < 500; i++) {
                CheckResult.counter++;
            }
        }).start();

        while (CheckResult.counter < 400){
            System.out.println("Not reached, keep waiting");
            Thread.sleep(1);
        }
        System.out.println("Reached, End of main thread");
    }
}
