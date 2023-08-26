package am.itspace.lesson.threadExample.exampleThread;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + ": " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
