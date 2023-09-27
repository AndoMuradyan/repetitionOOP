package am.itspace.lesson.threadExample.cuncurrency.future;

import java.util.List;
import java.util.concurrent.*;

public class MultipleTask {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Start of main thread");

        Callable<String> task = () -> "Result from the thread";

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            List<Future<String>> results = service.invokeAll(List.of(task,task,task));
            for (Future  result : results) {
                System.out.println(result.get());
            }
        }finally {
            if(service!= null){
                service.shutdown();
            }
        }
        System.out.println("End of main thread");
    }
}
