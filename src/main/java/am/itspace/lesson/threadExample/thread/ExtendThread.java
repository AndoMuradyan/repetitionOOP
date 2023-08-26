package am.itspace.lesson.threadExample.thread;

public class ExtendThread extends Thread{

    @Override
    public void run(){
        super.run();
        System.out.println(Thread.currentThread().getName());
    }
}
