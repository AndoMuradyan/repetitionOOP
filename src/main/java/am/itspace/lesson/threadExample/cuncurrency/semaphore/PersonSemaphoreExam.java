package am.itspace.lesson.threadExample.cuncurrency.semaphore;

import java.util.concurrent.Semaphore;

public class PersonSemaphoreExam extends Thread {
    Semaphore table;


    @Override
    public void run() {

        System.out.println(this.getName() + " waiting for table");
        try {
            table.acquire();
            System.out.println(this.getName() + " eat at the table");
            this.sleep(1000);
            System.out.println(this.getName() + " release table");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
