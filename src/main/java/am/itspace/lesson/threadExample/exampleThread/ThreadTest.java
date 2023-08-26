package am.itspace.lesson.threadExample.exampleThread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread("Thread 1");

        thread.start();

        MyThread thread1 = new MyThread("Thread 2");

        thread1.start();

        Thread thread2 = new Thread(new MyRunnable("Thread3 "));
        thread2.start();
    }
}
