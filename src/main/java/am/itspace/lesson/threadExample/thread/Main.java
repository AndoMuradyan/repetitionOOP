package am.itspace.lesson.threadExample.thread;

public class Main {
    public static void main(String[] args) {

//        ExtendThread extendThread = new ExtendThread();
//        System.out.println(Thread.currentThread().getName());
//        extendThread.start();

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("In the thread: " + Thread.currentThread().getName());
//            }
//        });
//        nuyny lambda greladzev
//        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        Thread t1 = new Thread(new ImplRunnable());
        t1.start();


    }

}
