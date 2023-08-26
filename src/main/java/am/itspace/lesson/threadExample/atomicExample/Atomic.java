package am.itspace.lesson.threadExample.atomicExample;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger atomicInteger = new AtomicInteger(0);
//        int a = 10;
//
//        for (int i = 0; i <= a; i++) {
//            if (a == atomicInteger.get()) {
//                a--;
//            } else {
//                atomicInteger.incrementAndGet();
//            }
//        }
//        System.out.println(a);
        int a = 8;
        Thread thread = new Thread();

        for (int i = 0; i <= a; i++) {
            if (a == 12) {
                a--;
            } else {
                atomicInteger.incrementAndGet();
            }
        }
        System.out.println("count a = " + a);

        thread.start();
        thread.join();

    }

}
