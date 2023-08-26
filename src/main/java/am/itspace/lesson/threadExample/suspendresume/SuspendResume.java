package am.itspace.lesson.threadExample.suspendresume;

public class SuspendResume {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        });
        t.start();
        t.getState();
//
//        System.out.println("Suspending the thread");
//        Thread.sleep(500);
//        t.suspend();
//
//        System.out.println("Resuming the thread");
//        Thread.sleep(1000);
//        t.resume();
//
//        Thread.sleep(500);
//        System.out.println("Stopping the thread");
//        t.stop();
//
//        t.join();
    }
}
