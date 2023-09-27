package am.itspace.lesson.threadExample.cuncurrency.schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledFixedRate {
    public static void main(String[] args) throws InterruptedException {


        Runnable task = () -> System.out.println("Printing in the thread!");
        ScheduledExecutorService scheduledExecutorService = null;

        try {
            scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            ScheduledFuture future = scheduledExecutorService.scheduleAtFixedRate(task,5,1, TimeUnit.SECONDS);

            Thread.sleep(10000);
            future.cancel(true);
        }finally {
            if (scheduledExecutorService != null){
                scheduledExecutorService.shutdown();
            }
        }

    }
}
