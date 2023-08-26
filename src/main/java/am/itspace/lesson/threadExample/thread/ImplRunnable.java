package am.itspace.lesson.threadExample.thread;

public class ImplRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
