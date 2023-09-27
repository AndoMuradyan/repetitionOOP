package am.itspace.lesson.threadExample.cuncurrency.future;

import java.util.concurrent.*;

public class CheckResult {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResult.counter++;
                }
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Task completed! ");
        } catch (TimeoutException e) {
            System.out.println("Not completed task on time");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
