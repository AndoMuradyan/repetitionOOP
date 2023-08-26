package am.itspace.lesson.threadExample.suspendresume;

public class MyThread implements Runnable {

    boolean isSuspended = false;

    Thread t;

    MyThread() {
        t = new Thread(this, "My thread");
    }

    @Override
    public void run() {
        System.out.println("Login in run method! ");
    }

    synchronized void pause() {
        if (!isSuspended) {
            try {
                wait();
                isSuspended = true;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("The thread is paused");
    }

    synchronized void play() {
        if (isSuspended) {
            notify();
            isSuspended = false;
        }
        System.out.println("The thread is play");
    }
}
